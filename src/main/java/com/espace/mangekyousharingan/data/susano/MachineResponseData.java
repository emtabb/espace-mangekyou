package com.espace.mangekyousharingan.data.susano;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MachineResponseData {

    @JsonProperty("id")
    Long id;

    @JsonProperty("name")
    String name;

    @JsonProperty("ip_address")
    String ipAddress;

    @JsonProperty("port")
    String port;

    /**
    * Status mô tả machine đã được kết nối thông qua adb hay chưa, check valid bằng adb devices
    */
    @JsonProperty("status")
    Boolean status;

    /**
    * Khi browser chưa từng xoá lịch sử sẽ không có default clear history là 1 hour,
    * Cần phải thực hiện function SetClearAllTimes() và chuyển trạng thái is_clear_all_times sang true
    */
    @JsonProperty("is_clear_all_times")
    Boolean isClearAllTimes;

    /**
     * Trước khi chuyển đến trang facebook, kiểm tra xem máy tính đã login facebook chưa
     *   - Nếu chưa (false) thực hiện các thao tác login và chuyển trạng thái biến thành (true)
     *   - Nếu rồi vào trực tiếp đường dẫn orders trên facebook để kết nối tới youtube web.
    */
    @JsonProperty("is_login_facebook")
    Boolean isLoginFacebook;

    /**
	* Khi đã từng login 1 tài khoản bất kì vào youtube rồi, sẽ không xuất hiện nút "Not now",
    * Vì khi đã login vô youtube rồi, nút Sign In sẽ không còn, thay vào đó là Icon Personal,
    * do đó cần thực hiện thêm 1 số thao tác khác để login thêm account.
    */
    @JsonProperty("is_login_youtube")
    Boolean isLoginYoutube;

    /**
     *  Lock = (true) mô tả đến việc đã có session kết nối tới machine này, không cho phép
     *  các luồng khác kết nối (thông qua database).
    */
    @JsonProperty("lock")
    Boolean lock;
}
