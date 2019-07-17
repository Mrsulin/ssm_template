package club.sulinxx.controller;

import club.sulinxx.pojo.User;
import club.sulinxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Title: UserController
 *
 * @author sulin
 * @date 2019-07-17
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping(value="/one",method = RequestMethod.GET)
    public String selectOne(Model model){
        User user = us.selectOne();
        model.addAttribute("user",user);
        return "test";

    }
}


