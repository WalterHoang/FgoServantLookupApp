package FGObackEnd.entities;

import javax.persistence.*;

@Entity
public class Servant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servant_id")
    private Integer Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "servant_icon_link")
    private String IconLink;
    @Column(name = "servant_cost")
    private Integer cost;
    @Column(name = "servant_rarity")
    private Integer rarity;
    @Column(name = "servant_class")
    private String sClass;
    @OneToOne
    @JoinColumn(name = "servant_id", referencedColumnName = "id")
    private Np np;
    @Column(name = "servant_attack_min")
    private String attackMin;
    @Column(name = "servant_attack_max")
    private String attackMax;
    @Column(name = "servant_hp_min")
    private String hpMin;
    @Column(name = "servant_hp_max")
    private String hpMax;
    @Column(name = "servant_alignments")
    private String alignment;
    @Column(name = "servant_traits")
    private String traits;
    @Column(name = "servant_card_layout")
    private String cardlayout;
    @Column(name = "skill1")
    private Integer skill1;
    @Column(name = "skill2")
    private Integer skill2;
    @Column(name = "skill3")
    private Integer skill3;
    @Column(name = "servant_interludes")
    private String interludes;
    @Column(name = "servant_strengthen")
    private String strengthen;

    public Servant(){}

    public Servant(String name, String iconLink, Integer cost, Integer rarity, String sClass, Np np, String attackMin, String attackMax, String hpMin, String hpMax, String alignment, String traits, String cardlayout, Integer skill1, Integer skill2, Integer skill3, String interludes, String strengthen) {
        this.Name = name;
        this.IconLink = iconLink;
        this.cost = cost;
        this.rarity = rarity;
        this.sClass = sClass;
        this.np = np;
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.alignment = alignment;
        this.traits = traits;
        this.cardlayout = cardlayout;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.interludes = interludes;
        this.strengthen = strengthen;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getIconLink() {
        return IconLink;
    }

    public void setIconLink(String iconLink) {
        this.IconLink = iconLink;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public Np getNp() {
        return np;
    }

    public void setNp(Np np) {
        this.np = np;
    }

    public String getAttackMin() {
        return attackMin;
    }

    public void setAttackMin(String attackMin) {
        this.attackMin = attackMin;
    }

    public String getAttackMax() {
        return attackMax;
    }

    public void setAttackMax(String attackMax) {
        this.attackMax = attackMax;
    }

    public String getHpMin() {
        return hpMin;
    }

    public void setHpMin(String hpMin) {
        this.hpMin = hpMin;
    }

    public String getHpMax() {
        return hpMax;
    }

    public void setHpMax(String hpMax) {
        this.hpMax = hpMax;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getTraits() {
        return traits;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }

    public String getCardlayout() {
        return cardlayout;
    }

    public void setCardlayout(String cardlayout) {
        this.cardlayout = cardlayout;
    }

    public Integer getSkill1() {
        return skill1;
    }

    public void setSkill1(Integer skill1) {
        this.skill1 = skill1;
    }

    public Integer getSkill2() {
        return skill2;
    }

    public void setSkill2(Integer skill2) {
        this.skill2 = skill2;
    }

    public Integer getSkill3() {
        return skill3;
    }

    public void setSkill3(Integer skill3) {
        this.skill3 = skill3;
    }

    public String getInterludes() {
        return interludes;
    }

    public void setInterludes(String interludes) {
        this.interludes = interludes;
    }

    public String getStrengthen() {
        return strengthen;
    }

    public void setStrengthen(String strengthen) {
        this.strengthen = strengthen;
    }
}
