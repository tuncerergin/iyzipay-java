package com.iyzipay.model;

import com.iyzipay.HttpClient;
import com.iyzipay.IyzipayResource;
import com.iyzipay.Options;
import com.iyzipay.request.CreateApprovalRequest;

public class Disapproval extends IyzipayResource {

    private String paymentTransactionId;

    public static Approval create(CreateApprovalRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyzipos/item/disapprove",
                getHttpHeaders(request, options),
                request,
                Approval.class)
                .getBody();
    }

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }
}