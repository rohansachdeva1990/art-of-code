package com.rohan.dp.command.solution.ex1.simple;

import com.rohan.dp.command.solution.ex1.simple.fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();
    }
}
