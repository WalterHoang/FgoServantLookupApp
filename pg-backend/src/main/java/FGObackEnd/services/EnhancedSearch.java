package FGObackEnd.services;

/**
 * This class handles any
 * alternative spellings of a servant name
 * or any nicknames
 */
class EnhancedSearch {
    String enhancedSearch(String name) {
        if (name.toLowerCase().equals("artoria") || name.toLowerCase().equals("arturia")) {
            name = "Altria";
        }
        if (name.toLowerCase().equals("cu")) {
            name = "Cú";
        }
        if (name.toLowerCase().equals("asvatthaman")) {
            name = "Aśvatthāman";
        }
        if (name.toLowerCase().equals("jalter")) {
            name = "Jeanne";
        }
        if (name.toLowerCase().equals("umu")) {
            name = "Nero";
        }
        if (name.toLowerCase().equals("raikou")) {
            name = "Raikō";
        }
        if (name.toLowerCase().equals("dantes")) {
            name = "Dantès";
        }
        if (name.toLowerCase().equals("emiya")) {
            name = "EMIYA";
        }
        if (name.toLowerCase().equals("liz")) {
            name = "Eli";
        }
        if (name.toLowerCase().equals("anjra")) {
            name = "Aŋra";
        }
        if (name.toLowerCase().equals("parvati")) {
            name = "Pārvatī";
        }
        if (name.toLowerCase().equals("yagyu")) {
            name = "Yagyū ";
        }
        if (name.toLowerCase().equals("danzo")) {
            name = "Danzō";
        }
        if (name.toLowerCase().equals("mecha liz")) {
            name = "Mecha Eli";
        }
        if (name.toLowerCase().equals("izo")) {
            name = "Izō";
        }
        if (name.toLowerCase().equals("ryoma")) {
            name = "Ryōma";
        }
        if (name.toLowerCase().equals("bb")) {
            name = "BB";
        }
        if (name.toLowerCase().equals("mhx")) {
            name = "Mysterious Heroine";
        }
        if (name.toLowerCase().equals("xiang") || name.toLowerCase().equals("xiang yu")) {
            name = "Xiàng Yǔ";
        }
        if (name.toLowerCase().equals("lanling")) {
            name = "Lánlíng";
        }
        if (name.toLowerCase().equals("qin")) {
            name = "Qín";
        }
        if (name.toLowerCase().equals("yu") || name.toLowerCase().equals("yu meiren") || name.toLowerCase().equals("meiren")) {
            name = "Yú Měirén";
        }
        if(name.toLowerCase().equals("chen") || name.toLowerCase().equals("gong") || name.toLowerCase().equals("chen gong")){
            name = "Chén Gōng";
        }

        return name;
    }
}
