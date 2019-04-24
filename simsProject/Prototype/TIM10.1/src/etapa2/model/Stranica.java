/***********************************************************************
 * Module:  Stranica.java
 * Author:  sale
 * Purpose: Defines the Class Stranica
 ***********************************************************************/

package etapa2.model;

import java.nio.file.NotDirectoryException;

import etapa1.model.Dokument;
import etapa1.model.Komponenta;
import etapa2.controller.EditIndexStranicaCommand;
import etapa2.model.events.EventBrojSlotova;
import etapa2.model.events.EventEditImeStranica;
import etapa2.model.events.EventEditIndexStranica;
import etapa2.model.events.EventVelicinaStranica;
import etapa3.model.Slot;
import etapa3.model.events.EventAddSlot;
import etapa3.model.events.EventRemoveSlot;

/** @pdOid b0e8fcdd-a791-4641-b667-273a8f93113a */
public class Stranica extends Komponenta {
   /** @pdOid c8c666e8-67b4-4d12-945e-9e15214adb5b */
   private Dokument maticniDokument;
   /** @pdOid 6c65f344-2bdd-46e3-b5a3-568c5ee71e52 */
   private int brojSlotova;
   /** @pdOid acf2bae6-00b6-4a67-8d06-d7f9781224b1 */
   private int redniBrojIndeksa;
   /** @pdOid 0081f1ad-059a-4742-82d0-5da46949646b */
   private int sirina;
   /** @pdOid 74f89b4e-5720-45c5-9e4d-89d3e1ce9a4f */
   private int duzina;
   /** @pdOid c14cfff1-60c7-49e3-a083-1d10a22699d0 */
   private String praviloRasporedaSlotova;
   /** @pdRoleInfo migr=no name=Slot assc=association2 coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition */
   public java.util.List<Slot> slotovi;
   
   /** @pdRoleInfo migr=no name=Dokument assc=association7 coll=java.util.List impl=java.util.ArrayList mult=0..* side=A */
   public java.util.List<Dokument> deljenUDokumentima;
   
   
   /** @param stranica
    * @pdOid 0d3bb538-3e38-42eb-845e-f1de82dbe4f6 */
   public int shareStranica(Stranica stranica) {
      // TODO: implement
      return 0;
   }
   
   /** @param stranica
    * @pdOid cefc5a62-edba-4ea0-81b5-0676d17fe0bb */
   public int detachStranica(Stranica stranica) {
      // TODO: implement
      return 0;
   }
   
   public void promenaImena(String noviNaziv) {
	      // TODO: implement
		   this.naziv=noviNaziv;
		   setChanged();
		   EventEditImeStranica event = new EventEditImeStranica(this,noviNaziv);
		   notifyObservers(event);
	   }
   
   /** @param novaPozicija
    * @pdOid 7c8180cc-07ca-404d-9892-08f6100e680d */
   public void promenaPozicijeStranice(int novaPozicija) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Slot> getSlotovi() {
      if (slotovi == null)
         slotovi = new java.util.ArrayList<Slot>();
      return slotovi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSlotovi() {
      if (slotovi == null)
         slotovi = new java.util.ArrayList<Slot>();
      return slotovi.iterator();
   }
   
   /** @pdGenerated default setter
    * @param newSlotovi */
  public void setSlotovi(java.util.List<Slot> newSlotovi) {
     removeAllSlotovi();
     for (java.util.Iterator iter = newSlotovi.iterator(); iter.hasNext();)
        addSlotovi((Slot)iter.next());
  }
  
  /** @pdGenerated default add
    * @param newSlot */
  public void addSlotovi(Slot newSlot) {
     if (newSlot == null)
        return;
     if (this.slotovi == null)
        this.slotovi = new java.util.ArrayList<Slot>();
     if (!this.slotovi.contains(newSlot))
     {
        this.slotovi.add(newSlot);
        if(newSlot.getMaticnaStranica()==null)
        	newSlot.setMaticnaStranica(this);
        else
        	newSlot.addSadrzanUStranicama(this);
        setChanged();
        EventAddSlot event = new EventAddSlot(this,newSlot);
        notifyObservers(event);   
     }
  }
  
  /** @pdGenerated default remove
    * @param oldSlot */
  public void removeSlotovi(Slot oldSlot) {
     if (oldSlot == null)
        return;
     if (this.slotovi != null)
        if (this.slotovi.contains(oldSlot))
        {
           this.slotovi.remove(oldSlot);
           if(oldSlot.getMaticnaStranica() != this)
        	   oldSlot.removeSadrzanUStranicama(this);
           setChanged();
           EventRemoveSlot event = new EventRemoveSlot(oldSlot,this);
           notifyObservers(event);
        }
  }
  
  /** @pdGenerated default removeAll */
  public void removeAllSlotovi() {
     if (slotovi != null)
     {
        Slot oldSlot;
        for (java.util.Iterator iter = getIteratorSlotovi(); iter.hasNext();)
        {
           oldSlot = (Slot)iter.next();
           iter.remove();
           oldSlot.removeSadrzanUStranicama(this);
        }
     }
  }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Dokument> getDeljenUDokumentima() {
      if (deljenUDokumentima == null)
         deljenUDokumentima = new java.util.ArrayList<Dokument>();
      return deljenUDokumentima;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDeljenUDokumentima() {
      if (deljenUDokumentima == null)
         deljenUDokumentima = new java.util.ArrayList<Dokument>();
      return deljenUDokumentima.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDeljenUDokumentima */
   public void setDeljenUDokumentima(java.util.List<Dokument> newDeljenUDokumentima) {
      removeAllDeljenUDokumentima();
      for (java.util.Iterator iter = newDeljenUDokumentima.iterator(); iter.hasNext();)
         addDeljenUDokumentima((Dokument)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDokument */
   public void addDeljenUDokumentima(Dokument newDokument) {
      if (newDokument == null)
         return;
      if (this.deljenUDokumentima == null)
         this.deljenUDokumentima = new java.util.ArrayList<Dokument>();
      if (!this.deljenUDokumentima.contains(newDokument))
      {
         this.deljenUDokumentima.add(newDokument);
         newDokument.addStranice(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDokument */
   public void removeDeljenUDokumentima(Dokument oldDokument) {
      if (oldDokument == null)
         return;
      if (this.deljenUDokumentima != null)
         if (this.deljenUDokumentima.contains(oldDokument))
         {
            this.deljenUDokumentima.remove(oldDokument);
            oldDokument.removeStranice(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDeljenUDokumentima() {
      if (deljenUDokumentima != null)
      {
         Dokument oldDokument;
         for (java.util.Iterator iter = getIteratorDeljenUDokumentima(); iter.hasNext();)
         {
            oldDokument = (Dokument)iter.next();
            iter.remove();
            oldDokument.removeStranice(this);
         }
      }
   }

public Dokument getMaticniDokument() {
	return maticniDokument;
}

public void setMaticniDokument(Dokument maticniDokument) {
	this.maticniDokument = maticniDokument;
}

public int getBrojSlotova() {
	return brojSlotova;
}

public void setBrojSlotova(int brojSlotova) {
	this.brojSlotova = brojSlotova;
	setChanged();
	EventBrojSlotova event = new EventBrojSlotova(this, brojSlotova);
	notifyObservers(event);
	
}

public int getRedniBrojIndeksa() {
	return redniBrojIndeksa;
}

public void setRedniBrojIndeksa(int redniBrojIndeksa) {
	EventEditIndexStranica event = new EventEditIndexStranica(this,redniBrojIndeksa);
	
	this.redniBrojIndeksa = redniBrojIndeksa;
	setChanged();
	notifyObservers(event);
}

public int getSirina() {
	return sirina;
}

public void setSirina(int sirina) {
	this.sirina = sirina;
}

public int getDuzina() {
	return duzina;
}

public void setDuzina(int duzina) {
	this.duzina = duzina;
}

public String getPraviloRasporedaSlotova() {
	return praviloRasporedaSlotova;
}

public void setPraviloRasporedaSlotova(String praviloRasporedaSlotova) {
	this.praviloRasporedaSlotova = praviloRasporedaSlotova;
}
public void setDimenzija(int duzina1, int sirina1) {
	duzina = duzina1;
	sirina = sirina1;
	setChanged();
	EventVelicinaStranica event = new EventVelicinaStranica(this, duzina1, sirina1);
    notifyObservers(event);
}
}