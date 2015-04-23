package resume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by diopous on 20/04/15.
 */

@Controller
@RequestMapping("/resume")
public class XMLController {

    private  ListeResume resumes;


    /*@RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String name) {

        Resume resume = new Resume(name, " DIOP "," Devenir Ingenieur ");

        return resume;

    }*/

    public XMLController()
    {
        resumes=new ListeResume();

        //Ajoute de langue dans la liste
       /* ListeLangue listeLangue=new ListeLangue();
        Language anglais=new Language("Anglais","Moyen");
        listeLangue.addLangue(anglais);
        Language wolof=new Language("Wolof","Tres Bien");
        listeLangue.addLangue(wolof);

        //ajout d'experience
        ListeExperience listeexp1=new ListeExperience();
        Experience developpeur=new Experience("Developement en Java","Developement d'une application en java","2012-2013");
        listeexp1.addExperience(developpeur);

        ListeExperience listexp2=new ListeExperience();
        Experience dev=new Experience();
        listexp2.addExperience(dev);

        //ajout de formation
        ListeFormation format=new ListeFormation();
        Formation fom=new Formation("2014-2015","Master 1 GIL","Universite de Rouen");
        format.addFormation(fom);

        Formation form=new Formation("2015-2016","Master 2 GIL","Universite de Rouen");
        format.addFormation(form);*/

        //Resume cv1=new Resume("DIOP","Ousmane","Devenir Ingenieur",listeLangue,listeexp1,format);
        Resume cv1=new Resume("DIOP","Ousmane","Devenir Ingenieur");
        resumes.addResume(cv1);

        //Resume cv2=new Resume("NDIAYE","Ousmane","Devenir Ingenieur",listeLangue,listexp2,format);
        Resume cv2=new Resume("NDIAYE","Ousmane","Devenir Ingenieur");
        resumes.addResume(cv2);

        //listexp2.removeExperience(dev);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ListeResume getResume()
    {
        return resumes;
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable int id) {
        return resumes.getResume(id);
    }

    @RequestMapping(method= RequestMethod.POST)
    public  @ResponseBody String addResume(@RequestBody Resume resume)
    {
        this.resumes.addResume(resume);
        return "CV Enregistre:"+resume.toString();
    }
}
