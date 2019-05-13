package cn.com.feiqun.user.obj;

import lombok.Data;

/**
 * @author feiqun
 * @date 2019/5/13 16:55
 * @desc
 */
@Data
public class Location {
    private String name;
    private double lon;
    private double lat;

    public Location(String name, double lon, double lat) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }
}
