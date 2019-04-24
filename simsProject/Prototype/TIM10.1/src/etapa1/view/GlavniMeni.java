package etapa1.view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import etapa1.controller.AddDokumentAction;
import etapa1.controller.AddProjekatAction;
import etapa1.controller.AddRadniProstorAction;
import etapa1.controller.CloseRadniProstorAction;
import etapa1.controller.DetachDokumentAction;
import etapa1.controller.DetachProjekatAction;
import etapa1.controller.EditImeDokumentAction;
import etapa1.controller.EditImeProjekatAction;
import etapa1.controller.EditImeRadniProstorAction;
import etapa1.controller.OpenDokumentAction;
import etapa1.controller.OpenProjekatAction;
import etapa1.controller.OpenRadniProstorAction;
import etapa1.controller.OpenSlobodniDokumentAction;
import etapa1.controller.OpenSlobodniProjekatAction;
import etapa1.controller.RemoveDokumentAction;
import etapa1.controller.RemoveProjekatAction;
import etapa1.controller.RemoveRadniProstorAction;
import etapa1.controller.SaveDokumentAction;
import etapa1.controller.SaveProjekatAction;
import etapa1.controller.ShareDokumentAction;
import etapa1.controller.ShareProjekatAction;
import etapa1.ostalo.Singleton;
import etapa2.controller.AddStranicaAction;
import etapa2.controller.Command;
import etapa2.controller.DetachStranicaAction;
import etapa2.controller.EditBrojSlotovaAction;
import etapa2.controller.EditImeStranicaAction;
import etapa2.controller.EditIndexStranicaAction;
import etapa2.controller.EditVelicinaStranicaAction;
import etapa2.controller.RemoveStranicaAction;
import etapa2.controller.ShareStranicaAction;
import etapa3.controller.AddElementAction;
import etapa3.controller.AddSlotAction;
import etapa3.controller.DetachSlotAction;
import etapa3.controller.RemoveElementAction;
import etapa3.controller.RemoveSlotAction;
import etapa3.controller.ShareSlotAction;


public class GlavniMeni extends JMenuBar{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -612111468754156763L;
	private JMenu file;
	
	private JMenu miNew;
	private JMenuItem mWorkspace;
	private JMenuItem mProject;
	private JMenuItem mDokument;
	private JMenuItem mPage;
	private JMenuItem mSlot;
	private JMenuItem mElement;

	
	private JMenuItem miDelete;
	private JMenuItem miDeleteRadniProstor;
	private JMenuItem miDeleteProjekat;
	private JMenuItem miDeleteDokument;
	private JMenuItem miDeleteStranica;
	private JMenuItem miDeleteSlot;
	private JMenuItem miDeleteElement;
	
	
	
	private JMenuItem miShare;
	private JMenuItem miShareProjekat;
	private JMenuItem miShareDokument;
	private JMenuItem miShareStranica;
	private JMenuItem miShareSlot;
	
	private JMenuItem miDetach;
	private JMenuItem miDetachProjekat;
	private JMenuItem miDetachDokument;
	private JMenuItem miDetachStranica;
	private JMenuItem miDetachSlot;
	
	
	private JMenuItem miOpenSlobodneKomponente;
	private JMenuItem miOpenSlobodniDokument;
	private JMenuItem miOpenSlobodniProjekat;
	
	
	private JMenuItem miOpenRadniProstor;
	private JMenuItem miCloseRadniProstor;
	
	
	private JMenuItem miPromenaImena;
	private JMenuItem miPromenaImenaRadniProstor;
	private JMenuItem miPromenaImenaProjekta;
	private JMenuItem miPromenaImenaDokumenta;
	private JMenuItem miPromenaImenaStranice;
	private JMenuItem miPromenaVelicineStranice;
	private JMenuItem miPromenaIndexStranice;
	private JMenuItem miPromenaBrojaSlotaStranice;
	
	private JMenuItem undo;
	

	
	
	private JMenuItem miOpen;
	private JMenuItem miOpenProjekat;
	private JMenuItem miOpenDokument;
	
	private JMenuItem miSave;
	private JMenuItem miSaveProjekat;
	private JMenuItem miSaveDokument;
	


	

	public GlavniMeni (){						
		
	    file=new JMenu("File");
	    miNew =new JMenu("New");
	    	  
		mWorkspace=new JMenuItem(new AddRadniProstorAction());

//-----------------------------------------------------------------------------

		mProject= new JMenuItem(new AddProjekatAction());
		
//-------------------------------------------------------------------------------		
		mDokument = new JMenuItem(new AddDokumentAction());
//------------------------------------------------------------------
		mPage = new JMenuItem(new AddStranicaAction());
		mSlot = new JMenuItem(new AddSlotAction());
		mElement = new JMenuItem(new AddElementAction());
		
		
//------------------------------------------------------------
		miNew.add(mWorkspace);
		miNew.add(mProject);
		miNew.add(mDokument);
		miNew.add(mPage);
		miNew.add(mSlot);
		miNew.add(mElement);
		miNew.addSeparator();
		
		
		miOpen =new JMenu("Import");
		miOpenProjekat = new JMenuItem(new OpenProjekatAction());
		miOpenDokument = new JMenuItem(new OpenDokumentAction());
		miOpen.add(miOpenProjekat);
		miOpen.add(miOpenDokument);
		
	    miSave =new JMenu("Save");
	    miSaveProjekat = new JMenuItem(new SaveProjekatAction());
	    miSaveDokument = new JMenuItem(new SaveDokumentAction());
	    miSave.add(miSaveProjekat);
	    miSave.add(miSaveDokument);
	 
        miDelete =new JMenu("Delete");
        miDeleteRadniProstor = new JMenuItem(new RemoveRadniProstorAction());
        miDeleteProjekat = new JMenuItem(new RemoveProjekatAction());
        miDeleteDokument = new JMenuItem(new RemoveDokumentAction());
        miDeleteStranica = new JMenuItem(new RemoveStranicaAction());
        miDeleteSlot = new JMenuItem(new RemoveSlotAction());
        miDeleteElement = new JMenuItem(new RemoveElementAction());
        miDelete.add(miDeleteRadniProstor);
        miDelete.add(miDeleteProjekat);
        miDelete.add(miDeleteDokument);
        miDelete.add(miDeleteStranica);
        miDelete.add(miDeleteSlot);
        miDelete.add(miDeleteElement);

		//--------------------------------------------------------------
        
        //share komponente
        miShare = new JMenu("Podeli");
        miShareProjekat= new JMenuItem(new ShareProjekatAction());
        miShareDokument= new JMenuItem(new ShareDokumentAction());
        miShareStranica= new JMenuItem(new ShareStranicaAction());
        miShareSlot = new JMenuItem(new ShareSlotAction());
        miShare.add(miShareProjekat);
        miShare.add(miShareDokument);
        miShare.add(miShareStranica);
        miShare.add(miShareSlot);
        
        //-----------------------------------------------------------
        miOpenRadniProstor = new JMenuItem(new OpenRadniProstorAction());
        miCloseRadniProstor = new JMenuItem(new CloseRadniProstorAction());
        miOpenSlobodneKomponente = new JMenu("Otvori slobodnu komponentu");
        miOpenSlobodniDokument = new JMenuItem(new OpenSlobodniDokumentAction());
        miOpenSlobodniProjekat = new JMenuItem(new OpenSlobodniProjekatAction());
        miOpenSlobodneKomponente.add(miOpenSlobodniDokument);
        miOpenSlobodneKomponente.add(miOpenSlobodniProjekat);
        
        //-----------------------------------------------------------------
        
        miPromenaImena= new JMenu("Promeni:");
        miPromenaImenaRadniProstor = new JMenuItem(new EditImeRadniProstorAction());
        miPromenaImenaProjekta = new JMenuItem(new EditImeProjekatAction());
        miPromenaImenaDokumenta = new JMenuItem(new EditImeDokumentAction());
        miPromenaImenaStranice = new JMenuItem(new EditImeStranicaAction());
        miPromenaVelicineStranice = new JMenuItem(new EditVelicinaStranicaAction());
        miPromenaIndexStranice = new JMenuItem(new EditIndexStranicaAction());
        miPromenaBrojaSlotaStranice = new JMenuItem(new EditBrojSlotovaAction());

        miPromenaImena.add(miPromenaImenaRadniProstor);
        miPromenaImena.add(miPromenaImenaProjekta);
        miPromenaImena.add(miPromenaImenaDokumenta);
        miPromenaImena.add(miPromenaImenaStranice);
        miPromenaImena.add(miPromenaVelicineStranice);
        miPromenaImena.add(miPromenaIndexStranice);
        miPromenaImena.add(miPromenaBrojaSlotaStranice);

        
		//---------------------------------------------------------
        undo = new JMenuItem(new UndoAction());
        //----------------------------------------------------------
	
	
		//---------------------------------------------------
		
		miDetach = new JMenu("Prekini deljenje");
		miDetachDokument = new JMenuItem(new DetachDokumentAction());
		miDetachProjekat = new JMenuItem(new DetachProjekatAction());
		miDetachStranica = new JMenuItem(new DetachStranicaAction());
		miDetachSlot = new JMenuItem(new DetachSlotAction());
		miDetach.add(miDetachProjekat);
		miDetach.add(miDetachDokument);
		miDetach.add(miDetachStranica);
		miDetach.add(miDetachSlot);
		
		//-------------------------------------------------------------
		
		file.add(miNew);
		file.addSeparator();
		file.add(miDelete);		
		file.addSeparator();
		file.add(miShare);
		file.add(miDetach);
		file.addSeparator();	
		file.add(miOpenRadniProstor);
		file.add(miCloseRadniProstor);
		file.add(miOpenSlobodneKomponente);
		file.addSeparator();
		file.add(miPromenaImena);
		file.addSeparator();
		file.add(undo);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miSave);

		
		

		

		

		add(file);
	
	}	
	
	
	public class UndoAction extends AbstractAction {
		public UndoAction() {
			// TODO Auto-generated constructor stub
			putValue(NAME, "Undo");

		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Command komanda=Singleton.getInstance().getComandManager().getKomande().pop();//uzeli smo iz steka tu zadnju komandu
			komanda.undo(); // uradili smo klasicni polimorfizam!
			
		}	
	}
	
	

	
}


