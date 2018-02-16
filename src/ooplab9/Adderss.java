package ooplab9;

public class Adderss {
    private String homeNO;
    private String province;
    private String postCode;

    public Adderss(String homeNO, String province, String postCode) {
        this.homeNO = homeNO;
        this.province = province;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Adderss{" +
                "homeNO='" + homeNO + '\'' +
                ", province='" + province + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    public String getHomeNO() {
        return homeNO;
    }

    public void setHomeNO(String homeNO) {
        this.homeNO = homeNO;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}//class
