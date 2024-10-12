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
<div>
    <div class="container mt-5">
        <div class="row">
            <div class="col-sm-6">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Liste des paniers</h5>
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Date</th>
                                    <th>Client</th>
                                    <th>Détails</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${paniersList}" var="panier">
                                    <tr>
                                        <td>${panier.id}</td>
                                        <td>${panier.date}</td>
                                        <td>${panier.client.id}</td>
                                        <td></td>
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

