package com.example.smart_union;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.help5g.uddoktapaysdk.UddoktaPay;

import java.util.HashMap;
import java.util.Map;

public class paybill extends AppCompatActivity {

    private static final String API_KEY = "982d381360a69d419689740d9f2e26ce36fb7a50";
    private static final String CHECKOUT_URL = "https://sandbox.uddoktapay.com/api/checkout-v2";
    private static final String VERIFY_PAYMENT_URL = "https://sandbox.uddoktapay.com/api/verify-payment";
    private static final String REDIRECT_URL = "https://your-site.com";
    private static final String CANCEL_URL = "https://your-site.com";

    // Instance variables to store payment information
    private String storedFullName;
    private String storedEmail;
    private String storedAmount;
    private String storedInvoiceId;
    private String storedPaymentMethod;
    private String storedSenderNumber;
    private String storedTransactionId;
    private String storedDate;
    private String storedFee;
    private String storedChargedAmount;

    private String storedMetaKey1;
    private String storedMetaValue1;

    private String storedMetaKey2;
    private String storedMetaValue2;

    private String storedMetaKey3;
    private String storedMetaValue3;

    LinearLayout uilayout, webviewlayout;
    TextView resultview;
    EditText namebox, amountbox;
    Spinner emailSpinner;
    Button paybutton;
    ImageView logo;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_paybill);

        uilayout = findViewById(R.id.uilayout);
        webviewlayout = findViewById(R.id.weblayout);

        resultview = findViewById(R.id.result);
        namebox = findViewById(R.id.editname);
        amountbox = findViewById(R.id.editamount);
        logo = findViewById(R.id.image);
        paybutton = findViewById(R.id.submitbtn);
        webView = findViewById(R.id.paywebview);
        emailSpinner = findViewById(R.id.emailSpinner);

        // Initialize the spinner with email options
        String[] emailOptions = {"হোল্ডিং ট্যাক্স", "জাতীয়তা সনদপত্র", "মৃত্যু সনদপত্র","ওয়ারিশ সনদপত্র","নাগরিকত্ব সনদপত্র","জন্ম সনদ","প্রতিবন্ধী সনদ","বিবাহিত সনদ","ভূমিহীন সনদ","প্রত্যয়ন পত্র"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, emailOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        emailSpinner.setAdapter(adapter);

        paybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uilayout.setVisibility(View.GONE);
                webviewlayout.setVisibility(View.VISIBLE);

                String FULL_NAME = namebox.getText().toString();
                String EMAIL = emailSpinner.getSelectedItem().toString();
                String enteredAmount = amountbox.getText().toString();

                // Set your metadata values in the map
                Map<String, String> metadataMap = new HashMap<>();
                metadataMap.put("order_number", "-1");
                metadataMap.put("product_id", "1122");
                metadataMap.put("CustomMetaData3", "Meta Value 3");

                UddoktaPay.PaymentCallback paymentCallback = new UddoktaPay.PaymentCallback() {
                    @Override
                    public void onPaymentStatus(String status, String fullName, String email, String amount, String invoiceId,
                                                String paymentMethod, String senderNumber, String transactionId,
                                                String date, Map<String, String> metadataValues, String fee, String chargeAmount) {
                        // Callback method triggered when the payment status is received from the payment gateway.
                        // It provides information about the payment transaction.
                        storedFullName = fullName;
                        storedEmail = email;
                        storedAmount = amount;
                        storedInvoiceId = invoiceId;
                        storedPaymentMethod = paymentMethod;
                        storedSenderNumber = senderNumber;
                        storedTransactionId = transactionId;
                        storedDate = date;
                        storedFee = fee;
                        storedChargedAmount = chargeAmount;

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // Clear previous metadata values to avoid duplication
                                storedMetaKey1 = null;
                                storedMetaValue1 = null;
                                storedMetaKey2 = null;
                                storedMetaValue2 = null;
                                storedMetaKey3 = null;
                                storedMetaValue3 = null;

                                // Iterate through the metadata map and store the key-value pairs
                                for (Map.Entry<String, String> entry : metadataValues.entrySet()) {
                                    String metadataKey = entry.getKey();
                                    String metadataValue = entry.getValue();

                                    if ("order_number".equals(metadataKey)) {
                                        storedMetaKey1 = metadataKey;
                                        storedMetaValue1 = metadataValue;
                                    } else if ("product_id".equals(metadataKey)) {
                                        storedMetaKey2 = metadataKey;
                                        storedMetaValue2 = metadataValue;
                                    } else if ("CustomMetaData3".equals(metadataKey)) {
                                        storedMetaKey3 = metadataKey;
                                        storedMetaValue3 = metadataValue;
                                    }
                                }

                                // Update UI based on payment status
                                if ("COMPLETED".equals(status)) {
                                    uilayout.setVisibility(View.VISIBLE);
                                    webviewlayout.setVisibility(View.GONE);
                                    resultview.setText("Payment Status:" + "Complete" + "\n" +
                                            "Name:" + storedFullName + "\n" +
                                            "email:" + storedEmail + "\n" +
                                            "Amount:" + storedAmount + "\n" +
                                            "Invoice ID:" + storedInvoiceId + "\n" +
                                            "Payment Method:" + storedPaymentMethod + "\n" +
                                            "Sender Number:" + storedSenderNumber + "\n" +
                                            "Transaction ID:" + storedTransactionId + "\n" +
                                            "Date:" + storedDate + "\n" +
                                            "Charge Amount:" + storedChargedAmount + "\n" +
                                            "Fee:" + storedFee + "\n" +
                                            storedMetaKey1 + ":" + storedMetaValue1 + "\n" +
                                            storedMetaKey2 + ":" + storedMetaValue2 + "\n" +
                                            storedMetaKey3 + ":" + storedMetaValue3 + "\n");
                                    // Handle payment completed case
                                } else if ("PENDING".equals(status)) {
                                    uilayout.setVisibility(View.VISIBLE);
                                    webviewlayout.setVisibility(View.GONE);
                                    resultview.setText("Payment Status:" + "Pending" + "\n" +
                                            "Name:" + storedFullName + "\n" +
                                            "email:" + storedEmail + "\n" +
                                            "Amount:" + storedAmount + "\n" +
                                            "Invoice ID:" + storedInvoiceId + "\n" +
                                            "Payment Method:" + storedPaymentMethod + "\n" +
                                            "Sender Number:" + storedSenderNumber + "\n" +
                                            "Transaction ID:" + storedTransactionId + "\n" +
                                            "Date:" + storedDate + "\n" +
                                            "Charge Amount:" + storedChargedAmount + "\n" +
                                            "Fee:" + storedFee + "\n" +
                                            storedMetaKey1 + ":" + storedMetaValue1 + "\n" +
                                            storedMetaKey2 + ":" + storedMetaValue2 + "\n" +
                                            storedMetaKey3 + ":" + storedMetaValue3 + "\n");
                                    // Handle payment pending case
                                } else if ("ERROR".equals(status)) {
                                    uilayout.setVisibility(View.VISIBLE);
                                    webviewlayout.setVisibility(View.GONE);
                                    // Handle payment error case
                                }
                            }
                        });
                    }
                };

                UddoktaPay uddoktapay = new UddoktaPay(webView, paymentCallback);
                uddoktapay.loadPaymentForm(API_KEY, FULL_NAME, EMAIL, enteredAmount, CHECKOUT_URL, VERIFY_PAYMENT_URL, REDIRECT_URL, CANCEL_URL, metadataMap);
            }
        });

























    }
}