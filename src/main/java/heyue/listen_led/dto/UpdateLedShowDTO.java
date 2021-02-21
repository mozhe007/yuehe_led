package heyue.listen_led.dto;

import lombok.Data;

import java.util.List;

/**
 * 更新Led显示屏整体
 */
@Data
public class UpdateLedShowDTO {

    private String deviceId;
    private String deviceName;
    private String programNo;
    private List<AreaDTO> areas;

}