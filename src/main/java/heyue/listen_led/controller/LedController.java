package heyue.listen_led.controller;

import heyue.listen_led.common.ResultCodeEnum;
import heyue.listen_led.dto.BaseRetDTO;
import heyue.listen_led.dto.PortReqDTO;
import heyue.listen_led.dto.UpdateLedPartShowDTO;
import heyue.listen_led.dto.UpdateLedShowDTO;
import heyue.listen_led.service.LedService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/led")
public class LedController {

    @Autowired
    private LedService ledService;

    @RequestMapping(value = "/getport",method = RequestMethod.GET)
    @ResponseBody
    public BaseRetDTO getPort( PortReqDTO portReqDTO){
        if(StringUtils.isBlank( portReqDTO.getDeviceId())
                || StringUtils.isBlank( portReqDTO.getDeviceName()) ){
            return  BaseRetDTO.error(ResultCodeEnum.MISS_PARAM);
        }
        return BaseRetDTO.success(ledService.getPort(portReqDTO));
    }

    @RequestMapping(value = "/getdeviceinfo",method = RequestMethod.GET)
    public String getDeviceInfo(PortReqDTO portReqDTO){
        return "2";
    }

    @RequestMapping(value = "/setledshow",method = RequestMethod.POST)
    public String setLedShow(UpdateLedShowDTO updateShowTextDTO){
        return "3";
    }

    @RequestMapping(value = "/updateareashow",method = RequestMethod.POST)
    public String updateareashow(UpdateLedPartShowDTO updateLedPartShowDTO){
        return "4";
    }

}