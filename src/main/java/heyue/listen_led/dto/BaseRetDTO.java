package heyue.listen_led.dto;

import heyue.listen_led.common.ResultCodeEnum;
import lombok.Data;

/**
 * 基础的返回
 */
@Data
public class BaseRetDTO<T> {

    private String retcode;
    private String retmsg;
    private T data;

    public static BaseRetDTO success(){
        BaseRetDTO baseRetDTO = new BaseRetDTO();
        baseRetDTO.setRetcode("1");
        baseRetDTO.setRetmsg("SUCCESS");
        return baseRetDTO;
    }

    public static BaseRetDTO success(Object data){
        BaseRetDTO baseRetDTO = new BaseRetDTO();
        baseRetDTO.setRetcode("1");
        baseRetDTO.setRetmsg("SUCCESS");
        baseRetDTO.setData(data);
        return baseRetDTO;
    }

    public static BaseRetDTO error(ResultCodeEnum enums) {
        BaseRetDTO baseRetDTO = new BaseRetDTO();
        baseRetDTO.setRetcode(enums.getCode());
        baseRetDTO.setRetmsg(enums.getText());
        return baseRetDTO;
    }

}
