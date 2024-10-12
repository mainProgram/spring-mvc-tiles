<%--
  Created by IntelliJ IDEA.
  User: fazeyna
  Date: 12/10/2024
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div>
    <div class="container mt-5">
        <div class="row">
            <div class="col-sm-6">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Ajout de commande</h5>
                        <form action="paniers" method="post">
                            <div class="mb-3">
                                <label for="input" class="form-label">Panier</label>
                                <select name="panier_id" class="form-control" id="input" required>
                                    <c:forEach items="${panierList}" var="panier">
                                        <option value="${panier.id}">${panier.id} - <fmt:formatDate value="${panier.date}" pattern="dd-MM-yyyy"/></option>
                                    </c:forEach>
                                </select>
                            </div>

                            <button type="submit" class="btn btn-primary">Enregistrer</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Liste des commandes</h5>
                        <table class="table table-striped table-hover">
                            <thead>
                            <tr>
                                <th>Id</th>
                                <th>Date</th>
                                <th>Détails</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${commandeList}" var="commande">
                                <tr>
                                    <td>${commande.id}</td>
                                    <td><fmt:formatDate value="${commande.date}" pattern="dd-MM-yyyy"/></td>
                                    <td>
                                        <a href="commandes/details/${commande.panier.id}">
                                            <i class="fas fa-eye" data-toggle="tooltip" title="Voir plus"></i>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

