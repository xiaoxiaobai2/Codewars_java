package sorted;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsItem implements java.lang.Comparable<NewsItem>{
    private String con;
    private Date date;
    private int dianjiliang;

    public NewsItem(String con, Date date, int dianjiliang) {
        this.con = con;
        this.date = date;
        this.dianjiliang = dianjiliang;
    }

    public NewsItem() {
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDianjiliang() {
        return dianjiliang;
    }

    public void setDianjiliang(int dianjiliang) {
        this.dianjiliang = dianjiliang;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("内容：").append(this.con).append(",")
                .append("点击量：").append(this.dianjiliang).append(",")
                .append("发布时间：").append(new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss").format(this.date))
                .append("\n");
        return sb.toString();
    }

    /*
    按  时间降序 +内容降序 + 点击量降序
     */
    @Override
    public int compareTo(NewsItem o) {
        int result=0;
        result = -this.date.compareTo(o.date);
        if (result==0){
            result=this.con.compareTo(o.con);
            if(result==0)
                result=this.dianjiliang-o.dianjiliang;
        }
        return result;
    }
}
