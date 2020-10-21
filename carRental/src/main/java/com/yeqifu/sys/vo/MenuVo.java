package com.yeqifu.sys.vo;

import com.yeqifu.sys.domain.Menu;

/**
 * 菜单扩展类
 */
public class MenuVo extends Menu {

    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
