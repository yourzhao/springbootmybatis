package cn.zhao.springbootmybatis.dao;

import cn.zhao.springbootmybatis.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出区域信息
     * @return
     */
    List<Area> queryArea();

    /**
     * 通过id查找区域信息
     * @param areaId
     * @return
     */
    Area queryAreaById(int  areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
