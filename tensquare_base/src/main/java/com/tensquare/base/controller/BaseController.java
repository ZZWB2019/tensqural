package com.tensquare.base.controller;

import com.tensquare.base.entity.Label;
import com.tensquare.base.service.LabelService;
import constant.enums.MsgEnum;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * baseController
 *
 * @author: zhouwb
 * @data: 2020/12/12
 */
@RestController
@CrossOrigin
@RequestMapping("/label")
public class BaseController {

    @Autowired
    private LabelService labelService;

    @GetMapping("/")
    public Result<Label> findAll() {
        return Result.newInstance(MsgEnum.SUCESS, labelService.list());
    }

    @GetMapping("/{labelId}")
    public Result findById(@PathVariable("labelId") String id) {
        return Result.newInstance(MsgEnum.SUCESS, labelService.findById(id));
    }

    @PostMapping("/save")
    public Result save(@RequestBody Label label) {
        labelService.save(label);
        return Result.newInstance(MsgEnum.SUCESS);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Label label) {
        labelService.update(label);
        return Result.newInstance(MsgEnum.SUCESS);
    }

    @DeleteMapping("/delete/{labelId}")
    public Result deleteById(@PathVariable("labelId") String id) {
        labelService.deleteByid(id);
        return Result.newInstance(MsgEnum.SUCESS);
    }
}
