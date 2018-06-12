package com.exo.ecommerce.infrastructure.http.presentation.checkout;

import com.exo.ecommerce.domain.invoice.Invoice;
import org.springframework.http.ResponseEntity;

public class CheckOutPresenter {

    public ResponseEntity present(Invoice invoice) {
        return ResponseEntity.ok(new CartCheckedOutResponse(invoice));
    }
}