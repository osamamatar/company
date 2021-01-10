       /*
       * To change this license header,        choose License Headers in Project Properties.
       * To change this template file, choose Tools | Templates
       * and open the template in the editor.
       */
        package companyv2;

       /**
       *
       * @author osama
       */
       public class Section {
       private static int id=1;
       private String sectionName;
       private LongServingEmployee manager;

       public Section( String sectionName, LongServingEmployee manager) 
      {
      this.id+=1;
      this.sectionName = sectionName;
      this.manager = manager;
      }

      public Section()
      {
      }
     

      public int getId() 
      {
      return id;
      }

      public void setId(int id) {
      this.id = id;
      }

      public String getSectionName() {
      return sectionName;
      }

      public void setSectionName(String setionName)
      {
     this.sectionName = sectionName;
      }


    

      
      

      public LongServingEmployee getManager() {
      return manager;
      }

      public void setManager(LongServingEmployee manager)  
      {
      this.manager = manager;
      }
             
      
    
      }
