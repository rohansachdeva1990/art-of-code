package com.rohan.dp.adapter.solution.ex1;

import com.rohan.dp.adapter.solution.ex1.thirdparty.Caramel;

// Way - 2
// Problem - As java does not support multiple inheritance Here it is Ok as Filter is a interface, but if it was an
// abstract class, then this wouldn't have been possible.
public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
