package heyue.listen_led.service;

import heyue.listen_led.dto.PortReqDTO;
import heyue.listen_led.entity.LedIpInfoDO;
import heyue.listen_led.repository.LedIpInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LedService {

    @Autowired
    private LedIpInfoRepository ledIpInfoRepository;

    /**
     *  根据 deviceId  和  deviceName 返回
     * @param portReqDTO
     * @return
     */
    public String getPort (PortReqDTO portReqDTO){
        // 1. 查询数据库，是否有记录
        LedIpInfoDO oldDO = ledIpInfoRepository.findByDeviceIdAndDeviceName(portReqDTO.getDeviceId(),portReqDTO.getDeviceName());
        // 2.1 没有记录，新生成并返回
        if (oldDO == null) {
            LedIpInfoDO ledIpInfoDO = new LedIpInfoDO();
            ledIpInfoDO.setCreateTime(new Date());
            ledIpInfoDO.setModifyTime(new Date());
            ledIpInfoDO.setDeviceId(portReqDTO.getDeviceId());
            ledIpInfoDO.setDeviceName(portReqDTO.getDeviceName());
            ledIpInfoDO.setIp("127");
            ledIpInfoDO.setPort("123");
            ledIpInfoDO.setStatus("12");
            ledIpInfoRepository.save(ledIpInfoDO);
            return "1";
        }
        // 2.2 有记录，老数据返回
        return oldDO.getPort();
    }
}
