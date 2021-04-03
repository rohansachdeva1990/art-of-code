package com.rohan.dp.command.solution.ex1.simple;

import com.rohan.dp.command.solution.ex1.simple.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
