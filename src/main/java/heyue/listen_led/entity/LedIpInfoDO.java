package heyue.listen_led.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="led_ip_info")
@Data
public class LedIpInfoDO {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="create_time")
    private Date createTime;
    @Column(name="modify_time")
    private Date modifyTime;
    @Column(name="device_id")
    private String deviceId;
    @Column(name="device_name")
    private String deviceName;
    @Column(name="ip")
    private String ip;
    @Column(name="port")
    private String port;
    @Column(name="status")
    private String status;

}
