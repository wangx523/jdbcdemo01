package neusoft_pro.controller;

import com.neusoft_pro.service.ProService;
import com.neusoft_pro.service.ProServiceImpl;


import java.sql.SQLException;

public class Controller {
    public static void main(String[] args) {

        ProService proService = new ProServiceImpl();
        try {
            System.out.println(proService.findByPid(1));
            System.out.println(proService.findByPri(3));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
