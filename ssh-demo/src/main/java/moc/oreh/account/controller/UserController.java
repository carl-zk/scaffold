package moc.oreh.account.controller;

import moc.oreh.account.entity.User;
import moc.oreh.account.repository.UserRepository;
import moc.oreh.account.service.IdentityService;
import moc.oreh.common.web.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    IdentityService identityService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/index")
    public ModelAndView login() {
        return new ModelAndView("index");
    }

    @RequestMapping("/error")
    public ModelAndView er() {
        ModelAndView error = new ModelAndView("error");
        error.addObject("msg", "错误信息");
        return error;
    }

    @GetMapping("/{userId}")
    public Result getUser(@PathVariable long userId) {
        User user = userRepository.get(User.class, userId);
        return Result.success(user);
    }

    @PostMapping("/add")
    public Result edit() {
        User user = new User("积分多少", 22);
        userRepository.saveOrUpdate(user);
        return Result.success(user);
    }

    @PostMapping("/delete")
    public Result edit(long userId) {
        User user = userRepository.get(User.class, userId);
        userRepository.delete(user);
        return Result.success(user);
    }

    @GetMapping("/list")
    public Result list() {
        return Result.success(userRepository.list(1, 100));
    }
}
