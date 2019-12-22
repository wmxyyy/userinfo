package cn.wmxyyy.domain;

import java.util.List;

/**
 * @author wmxyyy
 * @date 2019/12/10 14:15
 * @state 分页对象
 */
public class PageBean<T> {
    private List<T> list; //每页的数据

    private int totalCount; //总页数
    private int totalPage; //总页码
    private int currentPage; //当前页码
    private int rows; //每页显示的记录数

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "list=" + list +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }
}
