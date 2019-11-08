package FGObackEnd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Np {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "npname")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "level_effect")
    private String levelEffect;
    @Column(name = "lv_scale1")
    private String lvScale1;
    @Column(name = "lv_scale2")
    private String lvScale2;
    @Column(name = "lv_scale3")
    private String lvScale3;
    @Column(name = "lv_scale4")
    private String lvScale4;
    @Column(name = "lv_scale5")
    private String lvScale5;
    @Column(name = "overcharge_effect")
    private String ocEffect;
    @Column(name = "ocscale1")
    private String ocScale1;
    @Column(name = "ocscale2")
    private String ocScale2;
    @Column(name = "ocscale3")
    private String ocScale3;
    @Column(name = "ocscale4")
    private String ocScale4;
    @Column(name = "ocscale5")
    private String ocScale5;
    @Column(name = "other_effects")
    private String otherEffects;
    @Column(name = "upgrade")
    private String upgrade;
    @Column(name = "level_effectu")
    private String levelEffectU;
    @Column(name = "lv_scaleu1")
    private String lvScaleU1;
    @Column(name = "lv_scaleu2")
    private String lvScaleU2;
    @Column(name = "lv_scaleu3")
    private String lvScaleU3;
    @Column(name = "lv_scaleu4")
    private String lvScaleU4;
    @Column(name = "lv_scaleu5")
    private String lvScaleU5;
    @Column(name = "overcharge_effectu")
    private String ocEffectU;
    @Column(name = "ocscaleu1")
    private String ocScaleU1;
    @Column(name = "ocscaleu2")
    private String ocScaleU2;
    @Column(name = "ocscaleu3")
    private String ocScaleU3;
    @Column(name = "ocscaleu4")
    private String ocScaleU4;
    @Column(name = "ocscaleu5")
    private String ocScaleU5;
    @Column(name = "other_effectsu")
    private String otherEffectsU;
    @Column(name = "upgradename")
    private String upgradeName;
    @OneToOne(mappedBy = "np")
    @JsonIgnore
    private Servant servant;

    public Np (){}

    public Np(String name, String type, String levelEffect, String lvScale1, String lvScale2, String lvScale3, String lvScale4, String lvScale5, String ocEffect, String ocScale1, String ocScale2, String ocScale3, String ocScale4, String ocScale5, String otherEffects, String upgrade, String levelEffectU, String lvScaleU1, String lvScaleU2, String lvScaleU3, String lvScaleU4, String lvScaleU5, String ocEffectU, String ocScaleU1, String ocScaleU2, String ocScaleU3, String ocScaleU4, String ocScaleU5, String otherEffectsU, String upgradeName) {
        this.name = name;
        this.type = type;
        this.levelEffect = levelEffect;
        this.lvScale1 = lvScale1;
        this.lvScale2 = lvScale2;
        this.lvScale3 = lvScale3;
        this.lvScale4 = lvScale4;
        this.lvScale5 = lvScale5;
        this.ocEffect = ocEffect;
        this.ocScale1 = ocScale1;
        this.ocScale2 = ocScale2;
        this.ocScale3 = ocScale3;
        this.ocScale4 = ocScale4;
        this.ocScale5 = ocScale5;
        this.otherEffects = otherEffects;
        this.upgrade = upgrade;
        this.levelEffectU = levelEffectU;
        this.lvScaleU1 = lvScaleU1;
        this.lvScaleU2 = lvScaleU2;
        this.lvScaleU3 = lvScaleU3;
        this.lvScaleU4 = lvScaleU4;
        this.lvScaleU5 = lvScaleU5;
        this.ocEffectU = ocEffectU;
        this.ocScaleU1 = ocScaleU1;
        this.ocScaleU2 = ocScaleU2;
        this.ocScaleU3 = ocScaleU3;
        this.ocScaleU4 = ocScaleU4;
        this.ocScaleU5 = ocScaleU5;
        this.otherEffectsU = otherEffectsU;
        this.upgradeName = upgradeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevelEffect() {
        return levelEffect;
    }

    public void setLevelEffect(String levelEffect) {
        this.levelEffect = levelEffect;
    }

    public String getLvScale1() {
        return lvScale1;
    }

    public void setLvScale1(String lvScale1) {
        this.lvScale1 = lvScale1;
    }

    public String getLvScale2() {
        return lvScale2;
    }

    public void setLvScale2(String lvScale2) {
        this.lvScale2 = lvScale2;
    }

    public String getLvScale3() {
        return lvScale3;
    }

    public void setLvScale3(String lvScale3) {
        this.lvScale3 = lvScale3;
    }

    public String getLvScale4() {
        return lvScale4;
    }

    public void setLvScale4(String lvScale4) {
        this.lvScale4 = lvScale4;
    }

    public String getLvScale5() {
        return lvScale5;
    }

    public void setLvScale5(String lvScale5) {
        this.lvScale5 = lvScale5;
    }

    public String getOcEffect() {
        return ocEffect;
    }

    public void setOcEffect(String ocEffect) {
        this.ocEffect = ocEffect;
    }

    public String getOcScale1() {
        return ocScale1;
    }

    public void setOcScale1(String ocScale1) {
        this.ocScale1 = ocScale1;
    }

    public String getOcScale2() {
        return ocScale2;
    }

    public void setOcScale2(String ocScale2) {
        this.ocScale2 = ocScale2;
    }

    public String getOcScale3() {
        return ocScale3;
    }

    public void setOcScale3(String ocScale3) {
        this.ocScale3 = ocScale3;
    }

    public String getOcScale4() {
        return ocScale4;
    }

    public void setOcScale4(String ocScale4) {
        this.ocScale4 = ocScale4;
    }

    public String getOcScale5() {
        return ocScale5;
    }

    public void setOcScale5(String ocScale5) {
        this.ocScale5 = ocScale5;
    }

    public String getOtherEffects() {
        return otherEffects;
    }

    public void setOtherEffects(String otherEffects) {
        this.otherEffects = otherEffects;
    }

    public String getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }

    public String getLevelEffectU() {
        return levelEffectU;
    }

    public void setLevelEffectU(String levelEffectU) {
        this.levelEffectU = levelEffectU;
    }

    public String getLvScaleU1() {
        return lvScaleU1;
    }

    public void setLvScaleU1(String lvScaleU1) {
        this.lvScaleU1 = lvScaleU1;
    }

    public String getLvScaleU2() {
        return lvScaleU2;
    }

    public void setLvScaleU2(String lvScaleU2) {
        this.lvScaleU2 = lvScaleU2;
    }

    public String getLvScaleU3() {
        return lvScaleU3;
    }

    public void setLvScaleU3(String lvScaleU3) {
        this.lvScaleU3 = lvScaleU3;
    }

    public String getLvScaleU4() {
        return lvScaleU4;
    }

    public void setLvScaleU4(String lvScaleU4) {
        this.lvScaleU4 = lvScaleU4;
    }

    public String getLvScaleU5() {
        return lvScaleU5;
    }

    public void setLvScaleU5(String lvScaleU5) {
        this.lvScaleU5 = lvScaleU5;
    }

    public String getOcEffectU() {
        return ocEffectU;
    }

    public void setOcEffectU(String ocEffectU) {
        this.ocEffectU = ocEffectU;
    }

    public String getOcScaleU1() {
        return ocScaleU1;
    }

    public void setOcScaleU1(String ocScaleU1) {
        this.ocScaleU1 = ocScaleU1;
    }

    public String getOcScaleU2() {
        return ocScaleU2;
    }

    public void setOcScaleU2(String ocScaleU2) {
        this.ocScaleU2 = ocScaleU2;
    }

    public String getOcScaleU3() {
        return ocScaleU3;
    }

    public void setOcScaleU3(String ocScaleU3) {
        this.ocScaleU3 = ocScaleU3;
    }

    public String getOcScaleU4() {
        return ocScaleU4;
    }

    public void setOcScaleU4(String ocScaleU4) {
        this.ocScaleU4 = ocScaleU4;
    }

    public String getOcScaleU5() {
        return ocScaleU5;
    }

    public void setOcScaleU5(String ocScaleU5) {
        this.ocScaleU5 = ocScaleU5;
    }

    public String getOtherEffectsU() {
        return otherEffectsU;
    }

    public void setOtherEffectsU(String otherEffectsU) {
        this.otherEffectsU = otherEffectsU;
    }

    public String getUpgradeName() {
        return upgradeName;
    }

    public void setUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
    }
}
