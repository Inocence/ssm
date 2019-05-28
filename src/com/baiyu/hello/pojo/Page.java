package com.baiyu.hello.pojo;

public class Page {
    private int start = 0;
    private int pre = 0;
    private int end = 0;
    private int last = 0;
    private int count = 5;
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }
    public int getPre() {
        return pre;
    }
    public void setPre(int pre) {
        this.pre = pre;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }
    public void calLast(int total) {
        int temp = total % count;
        last =  total - (temp == 0 ? count : temp);
        pre = start - count > 0 ? start - count : 0;
        end  = start + count > last ? last : start + count;
    }
}
