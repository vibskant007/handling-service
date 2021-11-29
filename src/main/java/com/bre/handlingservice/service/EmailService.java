package com.bre.handlingservice.service;

import com.bre.handlingservice.model.Membership;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void sendEmail(Membership membership) {

        if(membership.isActivated()) {
            //select email template for activation & send
            System.out.println("Sending email with Activation");
        }

         if(membership.isUpgraded()) {
             System.out.println("Sending email with Upgrade");
         }


    }
}
