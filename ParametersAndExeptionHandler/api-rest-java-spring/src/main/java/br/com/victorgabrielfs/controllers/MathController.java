package br.com.victorgabrielfs.controllers;

import br.com.victorgabrielfs.utils.NumberUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo
    ) throws Exception {
        return NumberUtils.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtract(
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo
    ) throws Exception {

        return NumberUtils.subtract(numberOne, numberTwo);
    };

    @RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiply(
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo
    ) throws Exception {
        return NumberUtils.multiply(numberOne, numberTwo);
    }

    @RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divide(
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo
    ) throws Exception {
        return NumberUtils.divide(numberOne, numberTwo);
    }

    @RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo
    ) throws Exception {
        return NumberUtils.average(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sqrt/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(
            @PathVariable(value="numberOne") String numberOne
    ) throws Exception {
        return NumberUtils.sqrt(numberOne);
    }






}
