package FGObackEnd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "skill_icon")
    private String skillIconLink;
    @Column(name = "skill_name")
    private String name;
    @Column(name = "initialcd")
    private Integer initialCd;
    @Column(name = "skill_effect1")
    private String skillEffect1;
    @Column(name = "skill_effect2")
    private String skillEffect2;
    @Column(name = "skill_effect3")
    private String skillEffect3;
    @Column(name = "skill_effect4")
    private String skillEffect4;
    @Column(name = "skill_effect5")
    private String skillEffect5;
    @Column(name = "skill_effect6")
    private String skillEffect6;
    @Column(name = "efct1lv1")
    private String efct1Lv1;
    @Column(name = "efct1lv6")
    private String efct1Lv6;
    @Column(name = "efct1lv10")
    private String efct1Lv10;
    @Column(name = "efct2lv1")
    private String efct2Lv1;
    @Column(name = "efct2lv6")
    private String efct2Lv6;
    @Column(name = "efct2lv10")
    private String efct2Lv10;
    @Column(name = "efct3lv1")
    private String efct3Lv1;
    @Column(name = "efct3lv6")
    private String efct3Lv6;
    @Column(name = "efct3lv10")
    private String efct3Lv10;
    @Column(name = "efct4lv1")
    private String efct4Lv1;
    @Column(name = "efct4lv6")
    private String efct4Lv6;
    @Column(name = "efct4lv10")
    private String efct4Lv10;
    @Column(name = "efct5lv1")
    private String efct5Lv1;
    @Column(name = "efct5lv6")
    private String efct5Lv6;
    @Column(name = "efct5lv10")
    private String efct5Lv10;
    @Column(name = "efct6lv1")
    private String efct6Lv1;
    @Column(name = "efct6lv6")
    private String efct6Lv6;
    @Column(name = "efct6lv10")
    private String efct6Lv10;

    public Skills() {
    }

    public Skills(String skillIconLink, String name, Integer initialCd, String skillEffect1, String skillEffect2, String skillEffect3, String skillEffect4, String skillEffect5, String skillEffect6, String efct1Lv1, String efct1Lv6, String efct1Lv10, String efct2Lv1, String efct2Lv6, String efct2Lv10, String efct3Lv1, String efct3Lv6, String efct3Lv10, String efct4Lv1, String efct4Lv6, String efct4Lv10, String efct5Lv1, String efct5Lv6, String efct5Lv10, String efct6Lv1, String efct6Lv6, String efct6Lv10) {
        this.skillIconLink = skillIconLink;
        this.name = name;
        this.initialCd = initialCd;
        this.skillEffect1 = skillEffect1;
        this.skillEffect2 = skillEffect2;
        this.skillEffect3 = skillEffect3;
        this.skillEffect4 = skillEffect4;
        this.skillEffect5 = skillEffect5;
        this.skillEffect6 = skillEffect6;
        this.efct1Lv1 = efct1Lv1;
        this.efct1Lv6 = efct1Lv6;
        this.efct1Lv10 = efct1Lv10;
        this.efct2Lv1 = efct2Lv1;
        this.efct2Lv6 = efct2Lv6;
        this.efct2Lv10 = efct2Lv10;
        this.efct3Lv1 = efct3Lv1;
        this.efct3Lv6 = efct3Lv6;
        this.efct3Lv10 = efct3Lv10;
        this.efct4Lv1 = efct4Lv1;
        this.efct4Lv6 = efct4Lv6;
        this.efct4Lv10 = efct4Lv10;
        this.efct5Lv1 = efct5Lv1;
        this.efct5Lv6 = efct5Lv6;
        this.efct5Lv10 = efct5Lv10;
        this.efct6Lv1 = efct6Lv1;
        this.efct6Lv6 = efct6Lv6;
        this.efct6Lv10 = efct6Lv10;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillIconLink() {
        return skillIconLink;
    }

    public void setSkillIconLink(String skillIconLink) {
        this.skillIconLink = skillIconLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInitialCd() {
        return initialCd;
    }

    public void setInitialCd(Integer initialCd) {
        this.initialCd = initialCd;
    }

    public String getSkillEffect1() {
        return skillEffect1;
    }

    public void setSkillEffect1(String skillEffect1) {
        this.skillEffect1 = skillEffect1;
    }

    public String getSkillEffect2() {
        return skillEffect2;
    }

    public void setSkillEffect2(String skillEffect2) {
        this.skillEffect2 = skillEffect2;
    }

    public String getSkillEffect3() {
        return skillEffect3;
    }

    public void setSkillEffect3(String skillEffect3) {
        this.skillEffect3 = skillEffect3;
    }

    public String getSkillEffect4() {
        return skillEffect4;
    }

    public void setSkillEffect4(String skillEffect4) {
        this.skillEffect4 = skillEffect4;
    }

    public String getSkillEffect5() {
        return skillEffect5;
    }

    public void setSkillEffect5(String skillEffect5) {
        this.skillEffect5 = skillEffect5;
    }

    public String getSkillEffect6() {
        return skillEffect6;
    }

    public void setSkillEffect6(String skillEffect6) {
        this.skillEffect6 = skillEffect6;
    }

    public String getEfct1Lv1() {
        return efct1Lv1;
    }

    public void setEfct1Lv1(String efct1Lv1) {
        this.efct1Lv1 = efct1Lv1;
    }

    public String getEfct1Lv6() {
        return efct1Lv6;
    }

    public void setEfct1Lv6(String efct1Lv6) {
        this.efct1Lv6 = efct1Lv6;
    }

    public String getEfct1Lv10() {
        return efct1Lv10;
    }

    public void setEfct1Lv10(String efct1Lv10) {
        this.efct1Lv10 = efct1Lv10;
    }

    public String getEfct2Lv1() {
        return efct2Lv1;
    }

    public void setEfct2Lv1(String efct2Lv1) {
        this.efct2Lv1 = efct2Lv1;
    }

    public String getEfct2Lv6() {
        return efct2Lv6;
    }

    public void setEfct2Lv6(String efct2Lv6) {
        this.efct2Lv6 = efct2Lv6;
    }

    public String getEfct2Lv10() {
        return efct2Lv10;
    }

    public void setEfct2Lv10(String efct2Lv10) {
        this.efct2Lv10 = efct2Lv10;
    }

    public String getEfct3Lv1() {
        return efct3Lv1;
    }

    public void setEfct3Lv1(String efct3Lv1) {
        this.efct3Lv1 = efct3Lv1;
    }

    public String getEfct3Lv6() {
        return efct3Lv6;
    }

    public void setEfct3Lv6(String efct3Lv6) {
        this.efct3Lv6 = efct3Lv6;
    }

    public String getEfct3Lv10() {
        return efct3Lv10;
    }

    public void setEfct3Lv10(String efct3Lv10) {
        this.efct3Lv10 = efct3Lv10;
    }

    public String getEfct4Lv1() {
        return efct4Lv1;
    }

    public void setEfct4Lv1(String efct4Lv1) {
        this.efct4Lv1 = efct4Lv1;
    }

    public String getEfct4Lv6() {
        return efct4Lv6;
    }

    public void setEfct4Lv6(String efct4Lv6) {
        this.efct4Lv6 = efct4Lv6;
    }

    public String getEfct4Lv10() {
        return efct4Lv10;
    }

    public void setEfct4Lv10(String efct4Lv10) {
        this.efct4Lv10 = efct4Lv10;
    }

    public String getEfct5Lv1() {
        return efct5Lv1;
    }

    public void setEfct5Lv1(String efct5Lv1) {
        this.efct5Lv1 = efct5Lv1;
    }

    public String getEfct5Lv6() {
        return efct5Lv6;
    }

    public void setEfct5Lv6(String efct5Lv6) {
        this.efct5Lv6 = efct5Lv6;
    }

    public String getEfct5Lv10() {
        return efct5Lv10;
    }

    public void setEfct5Lv10(String efct5Lv10) {
        this.efct5Lv10 = efct5Lv10;
    }

    public String getEfct6Lv1() {
        return efct6Lv1;
    }

    public void setEfct6Lv1(String efct6Lv1) {
        this.efct6Lv1 = efct6Lv1;
    }

    public String getEfct6Lv6() {
        return efct6Lv6;
    }

    public void setEfct6Lv6(String efct6Lv6) {
        this.efct6Lv6 = efct6Lv6;
    }

    public String getEfct6Lv10() {
        return efct6Lv10;
    }

    public void setEfct6Lv10(String efct6Lv10) {
        this.efct6Lv10 = efct6Lv10;
    }
}
