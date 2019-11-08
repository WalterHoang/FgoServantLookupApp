import { ServantNp } from './servant-np.model';

export class Servant {
    public id: number;
    public name: string;
    public iconLink: string;
    public cost: number;
    public rarity: number;
    public sClass: string;
    public np: ServantNp;
    public attackMin: number;
    public attackMax: number;
    public hpMin: number;
    public hpMax: number;
    public alignment: string;
    public traits: string;
    public cardlayout: string;
    public skill1: number;
    public skill2: number;
    public skill3: number;
    public interludes: string;
    public strengthen: string;
    constructor(
        id: number,
        name: string,
        iconLink: string,
        cost: number,
        rarity: number,
        sClass: string,
        np: ServantNp,
        attackMin: number,
        attackMax: number,
        hpMin: number,
        hpMax: number,
        alignment: string,
        traits: string,
        cardlayout: string,
        skill1: number,
        skill2: number,
        skill3: number,
        interludes: string,
        strengthen: string) {
        this.id = id;
        this.name = name;
        this.iconLink = iconLink;
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
}