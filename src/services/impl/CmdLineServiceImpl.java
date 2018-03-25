package services.impl;

import services.CmdLineService;
import services.FoodService;

public class CmdLineServiceImpl implements CmdLineService {

    //этот сервис принимает комманды из командной строки, и отображает всякие менюхи

    private FoodService foodService;

    public CmdLineServiceImpl(FoodService foodService) {
        this.foodService = foodService;
    }
}
