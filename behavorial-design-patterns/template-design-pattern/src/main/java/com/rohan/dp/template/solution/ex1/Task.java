package com.rohan.dp.template.solution.ex1;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

 /*
   // Only useful if we are working with an interface; but here we have a concrete impl.
   /// So its better to decouple it.
   public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }*/

    public void execute() {
        auditTrail.record();
        doExecute();

    }

    protected abstract void doExecute();
}
