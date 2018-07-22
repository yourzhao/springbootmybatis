package cn.zhao.springbootmybatis.service;

import cn.zhao.springbootmybatis.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> getAreaList();

    /**
     * 通过id查找区域信息
     * @param areaId
     * @return
     */
    Area getAreaById(int  areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
