package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;
import org.launchcode.models.data.CheeseDao;
import org.launchcode.models.data.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    private Menu menu;

    private Iterable<Cheese> cheeses;

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    @Autowired
    private CheeseDao cheeseDao;
    @Autowired
    private MenuDao menuDao;

    public AddMenuItemForm (){}

    public AddMenuItemForm(Menu menu){
        menu = this.menu;
        cheeses = cheeseDao.findAll();
    }


}
