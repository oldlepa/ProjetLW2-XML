package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by diopous on 20/04/15.
 */

@XmlRootElement(name = "resume")
public class Resume {

    public int id;
    public String name;
    public String nom;
    public String objectif;
    /*ListeLangue langue;
    ListeExperience experience;
    ListeFormation formation;*/

    public Resume(){
        this.id=0;
        this.name="";
        this.nom="";
        /*this.langue=new ListeLangue();
        this.experience=new ListeExperience();
        this.formation=new ListeFormation();*/

    }

    //,ListeLangue langue,ListeExperience experience,ListeFormation formation
    public Resume(String name,String nom,String objectif)
    {
        this.name=name;
        this.nom=nom;
        this.objectif=objectif;
        /*this.langue=langue;
        this.experience=experience;
        this.formation=formation;*/
    }


}
