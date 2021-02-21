package heyue.listen_led.repository;

import heyue.listen_led.entity.LedIpInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedIpInfoRepository extends JpaRepository<LedIpInfoDO,Integer> {

    LedIpInfoDO findByDeviceIdAndDeviceName(String deviceId, String deviceName);
}
