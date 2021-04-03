package com.rohan.dp.template.problem.ex1;

public class TransferMoneyTask {

    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        System.out.println("Transfer money");
    }
}
