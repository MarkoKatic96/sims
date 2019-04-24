/***********************************************************************
 * Module:  AddStranicaCommand.java
 * Author:  SALE
 * Purpose: Defines the Class AddStranicaCommand
 ***********************************************************************/

package etapa2.controller;

import etapa1.model.Dokument;
import etapa1.ostalo.Singleton;
import etapa2.model.Stranica;

/** @pdOid eda56a4e-457e-472a-bdb1-a11864386e8b */
public class AddStranicaCommand extends Command {
   /** @pdOid f43f0fe8-2cec-4211-8383-49282a4ec5c6 */
   private Stranica stranica;
   /** @pdOid 234aacb1-d3c0-4b1b-8831-8cb02d28421d */
   private Dokument dokument;

public AddStranicaCommand(Stranica stranica, Dokument dokument) {
	super();
	this.stranica = stranica;
	this.dokument = dokument;
}

/** @pdOid c4b8c912-a641-44d2-b425-0fd0af030a21 */
public void ddo() {
   // TODO: implement
	Singleton.getInstance().getComandManager().getKomande().push(this); //ubacili smo da je izvresna ova komanda!
}

/** @pdOid 22f17b51-96ec-4d7b-9a68-d7c45521ed0f */
public void undo() {
   // TODO: implement
	   dokument.removeStranice(stranica);
}
public Stranica getStranica() {
	return stranica;
}
public void setStranica(Stranica stranica) {
	this.stranica = stranica;
}
public Dokument getDokument() {
	return dokument;
}
public void setDokument(Dokument dokument) {
	this.dokument = dokument;
}



  


}