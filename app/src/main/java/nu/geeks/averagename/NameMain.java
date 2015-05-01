package nu.geeks.averagename;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Random;


public class NameMain extends Activity {

    ListView listView;
    ArrayList<String> names;
    ArrayAdapter<String> nAdapter;
    Button bAdd, bAverage;
    EditText eName;

    String namn = "30.8\tAbbe\n" +
            "30.12\tAbel\n" +
            "18.12\tAbraham\n" +
            "16.6\tAcke\n" +
            "10.3\tAda\n" +
            "30.8\tAdalbert\n" +
            "23.12\tAdam\n" +
            "5.9\tAdela\n" +
            "5.9\tAdele\n" +
            "5.9\tAdelia\n" +
            "5.9\tAdelina\n" +
            "5.9\tAdla\n" +
            "23.6\tAdolf\n" +
            "6.11\tAdolf\n" +
            "23.6\tAdolfina\n" +
            "4.3\tAdrian\n" +
            "4.3\tAdriana\n" +
            "4.3\tAdrienne\n" +
            "5.2\tAgata\n" +
            "5.2\tAgaton\n" +
            "5.2\tAgda\n" +
            "7.1\tAge\n" +
            "7.1\tAgge\n" +
            "21.1\tAgna\n" +
            "13.2\tAgne\n" +
            "21.1\tAgnes\n" +
            "21.1\tAgneta\n" +
            "21.1\tAgnete\n" +
            "5.7\tAila\n" +
            "5.7\tAili\n" +
            "13.6\tAina\n" +
            "13.6\tAini\n" +
            "13.6\tAino\n" +
            "5.8\tAlarik\n" +
            "30.8\tAlba\n" +
            "30.8\tAlbert\n" +
            "30.8\tAlbertina\n" +
            "30.8\tAlberto\n" +
            "1.3\tAlbin\n" +
            "30.8\tAlbrekt\n" +
            "17.2\tAlda\n" +
            "23.6\tAlef\n" +
            "17.2\tAlejandra\n" +
            "12.12\tAlejandro\n" +
            "12.12\tAlessandro\n" +
            "12.12\tAlex\n" +
            "12.12\tAlexander\n" +
            "17.2\tAlexandra\n" +
            "12.12\tAlexia\n" +
            "12.12\tAlexis\n" +
            "12.12\tAlexius\n" +
            "21.6\tAlf\n" +
            "3.9\tAlfhild\n" +
            "6.8\tAlfons\n" +
            "3.1\tAlfred\n" +
            "3.1\tAlfrida\n" +
            "30.7\tAlgot\n" +
            "23.6\tAlice\n" +
            "23.6\tAlicia\n" +
            "5.9\tAlida\n" +
            "5.9\tAlina\n" +
            "5.9\tAline\n" +
            "17.2\tAlla\n" +
            "22.4\tAllan\n" +
            "17.2\tAlli\n" +
            "17.2\tAllie\n" +
            "17.2\tAlly\n" +
            "8.9\tAlma\n" +
            "5.8\tAlrik\n" +
            "3.9\tAlva\n" +
            "21.6\tAlvar\n" +
            "21.6\tAlve\n" +
            "3.9\tAlvi\n" +
            "1.3\tAlvin\n" +
            "3.9\tAlvina\n" +
            "3.9\tAlvy\n" +
            "20.4\tAmalia\n" +
            "20.4\tAmalie\n" +
            "26.10\tAmanda\n" +
            "26.10\tAmandus\n" +
            "20.4\tAmelia\n" +
            "20.4\tAmelie\n" +
            "26.10\tAmy\n" +
            "30.11\tAnders\n" +
            "30.11\tAndras\n" +
            "10.7\tAndré\n" +
            "10.7\tAndrea\n" +
            "30.11\tAndreas\n" +
            "30.11\tAndrej\n" +
            "30.11\tAndres\n" +
            "30.11\tAndrew\n" +
            "10.7\tAndrietta\n" +
            "30.11\tAndris\n" +
            "30.11\tAndy\n" +
            "7.12\tAngela\n" +
            "7.12\tAngelika\n" +
            "9.9\tAnita\n" +
            "9.12\tAnna\n" +
            "21.4\tAnneli\n" +
            "21.4\tAnnelie\n" +
            "9.9\tAnnette\n" +
            "21.4\tAnnika\n" +
            "4.2\tAnselm\n" +
            "4.2\tAnsgar\n" +
            "4.2\tAnsgarius\n" +
            "30.11\tAnte\n" +
            "30.11\tAntero\n" +
            "17.1\tAnthony\n" +
            "17.10\tAntoinetta\n" +
            "17.10\tAntoinette\n" +
            "17.1\tAnton\n" +
            "17.1\tAntoni\n" +
            "17.10\tAntonia\n" +
            "17.10\tAntonina\n" +
            "17.1\tAntonio\n" +
            "17.1\tAntonius\n" +
            "30.11\tAntti\n" +
            "4.8\tArent\n" +
            "4.8\tArild\n" +
            "4.8\tArndt\n" +
            "4.8\tArne\n" +
            "4.8\tArno\n" +
            "4.8\tArnold\n" +
            "1.7\tAron\n" +
            "13.4\tArto\n" +
            "13.4\tArtur\n" +
            "31.8\tArve\n" +
            "31.8\tArvid\n" +
            "31.8\tArvida\n" +
            "31.8\tArvo\n" +
            "10.5\tAsbjörn\n" +
            "12.9\tAslög\n" +
            "16.12\tAssar\n" +
            "16.12\tAsser\n" +
            "27.11\tAsta\n" +
            "27.11\tAstrid\n" +
            "7.1\tAugust\n" +
            "7.1\tAugusta\n" +
            "7.1\tAugustin\n" +
            "7.1\tAugustinus\n" +
            "3.7\tAura\n" +
            "3.7\tAurora\n" +
            "3.7\tAurore\n" +
            "16.6\tAxel\n" +
            "16.6\tAxelia\n" +
            "16.6\tAxelina\n" +
            "6.1\tBaltsar\n" +
            "4.12\tBarbara\n" +
            "4.12\tBarbro\n" +
            "24.8\tBarthold\n" +
            "24.8\tBartolomeus\n" +
            "2.12\tBeata\n" +
            "2.12\tBeatrice\n" +
            "27.5\tBeda\n" +
            "20.6\tBelinda\n" +
            "30.10\tBella\n" +
            "30.10\tBellis\n" +
            "28.12\tBen\n" +
            "21.3\tBenedikt\n" +
            "21.3\tBengt\n" +
            "21.3\tBengta\n" +
            "21.3\tBenita\n" +
            "28.12\tBenjamin\n" +
            "28.12\tBenni\n" +
            "28.12\tBennie\n" +
            "28.12\tBenny\n" +
            "21.3\tBent\n" +
            "13.10\tBerit\n" +
            "20.8\tBerna\n" +
            "20.8\tBernhard\n" +
            "20.8\tBernhardina\n" +
            "20.8\tBernt\n" +
            "8.2\tBert\n" +
            "8.2\tBerta\n" +
            "11.6\tBertel\n" +
            "11.6\tBerthold\n" +
            "11.6\tBertil\n" +
            "8.2\tBertina\n" +
            "19.11\tBessie\n" +
            "19.11\tBeth\n" +
            "19.11\tBetsy\n" +
            "19.11\tBettina\n" +
            "19.11\tBetty\n" +
            "7.10\tBibbi\n" +
            "6.4\tBill\n" +
            "6.4\tBilly\n" +
            "27.10\tBina\n" +
            "9.6\tBirger\n" +
            "13.10\tBirgit\n" +
            "7.10\tBirgitta\n" +
            "7.10\tBirgitte\n" +
            "7.10\tBirte\n" +
            "18.6\tBjarne\n" +
            "18.6\tBjörn\n" +
            "18.6\tBjörne\n" +
            "18.6\tBjörner\n" +
            "27.5\tBlenda\n" +
            "5.6\tBo\n" +
            "7.6\tBob\n" +
            "7.6\tBobby\n" +
            "26.1\tBodil\n" +
            "26.1\tBoel\n" +
            "28.5\tBojan\n" +
            "26.1\tBolla\n" +
            "5.6\tBonde\n" +
            "28.5\tBorghild\n" +
            "10.6\tBoris\n" +
            "26.1\tBotilda\n" +
            "28.7\tBotvid\n" +
            "7.10\tBrigitta\n" +
            "7.10\tBrigitte\n" +
            "7.10\tBritt\n" +
            "7.10\tBritta\n" +
            "7.10\tBritte\n" +
            "7.10\tBritten\n" +
            "5.10\tBror\n" +
            "17.7\tBruno\n" +
            "16.8\tBrynolf\n" +
            "7.10\tBöret\n" +
            "9.6\tBörje\n" +
            "20.5\tCalla\n" +
            "7.3\tCamilla\n" +
            "7.5\tCarina\n" +
            "7.5\tCarine\n" +
            "7.5\tCarita\n" +
            "28.1\tCarlo\n" +
            "28.1\tCarlos\n" +
            "28.1\tCarol\n" +
            "20.5\tCarola\n" +
            "20.5\tCarole\n" +
            "20.5\tCaroline\n" +
            "6.1\tCaspar\n" +
            "22.11\tCecilia\n" +
            "28.1\tCharles\n" +
            "28.1\tCharlie\n" +
            "12.5\tCharlott\n" +
            "12.5\tCharlotta\n" +
            "12.5\tCharlotte\n" +
            "15.3\tChris\n" +
            "24.7\tChrista\n" +
            "15.3\tChristel\n" +
            "24.7\tChristiane\n" +
            "22.11\tCilla\n" +
            "22.11\tCissi\n" +
            "7.7\tClaes\n" +
            "12.8\tClaire\n" +
            "12.8\tClarence\n" +
            "12.8\tClarie\n" +
            "12.8\tClarissa\n" +
            "12.8\tClary\n" +
            "7.7\tClaus\n" +
            "21.5\tConnie\n" +
            "21.5\tConny\n" +
            "21.5\tConstance\n" +
            "16.9\tDag\n" +
            "16.9\tDaga\n" +
            "16.9\tDage\n" +
            "27.9\tDagmar\n" +
            "11.9\tDagny\n" +
            "11.12\tDan\n" +
            "11.12\tDana\n" +
            "11.12\tDaniel\n" +
            "11.12\tDaniela\n" +
            "11.12\tDanny\n" +
            "25.6\tDavid\n" +
            "25.6\tDavida\n" +
            "7.8\tDenise\n" +
            "7.8\tDennis\n" +
            "23.5\tDesideria\n" +
            "23.5\tDesirée\n" +
            "29.1\tDiana\n" +
            "29.1\tDiane\n" +
            "7.2\tDick\n" +
            "3.2\tDisa\n" +
            "31.10\tDitte\n" +
            "6.2\tDolly\n" +
            "6.2\tDora\n" +
            "6.2\tDordi\n" +
            "6.2\tDoris\n" +
            "6.2\tDorit\n" +
            "6.2\tDorotea\n" +
            "6.2\tDorothy\n" +
            "6.2\tDorrit\n" +
            "6.2\tDorthy\n" +
            "13.4\tDouglas\n" +
            "6.3\tEbba\n" +
            "6.3\tEbbe\n" +
            "24.10\tEberhard\n" +
            "18.3\tEdde\n" +
            "18.3\tEddie\n" +
            "18.3\tEddy\n" +
            "31.10\tEdgar\n" +
            "31.10\tEdgard\n" +
            "31.10\tEdit\n" +
            "10.3\tEdla\n" +
            "18.3\tEdmund\n" +
            "18.3\tEduardo\n" +
            "18.3\tEdvard\n" +
            "11.3\tEdvin\n" +
            "18.5\tEero\n" +
            "11.3\tEgon\n" +
            "31.7\tEila\n" +
            "24.10\tEilert\n" +
            "26.9\tEina\n" +
            "26.9\tEinar\n" +
            "8.6\tEivor\n" +
            "26.9\tEje\n" +
            "31.7\tElaine\n" +
            "11.7\tEleanor\n" +
            "31.7\tElena\n" +
            "11.7\tEleonora\n" +
            "11.7\tEleonore\n" +
            "30.6\tElf\n" +
            "18.2\tElfrida\n" +
            "18.2\tElfriede\n" +
            "21.11\tElga\n" +
            "31.7\tEli\n" +
            "17.4\tElias\n" +
            "31.7\tElin\n" +
            "31.7\tElina\n" +
            "31.7\tEline\n" +
            "17.4\tElis\n" +
            "20.9\tElisa\n" +
            "19.11\tElisabet\n" +
            "20.9\tElise\n" +
            "19.11\tElisif\n" +
            "19.11\tEliza\n" +
            "19.2\tElla\n" +
            "18.8\tEllen\n" +
            "11.7\tElli\n" +
            "11.10\tElling\n" +
            "11.7\tEllinor\n" +
            "17.4\tEllis\n" +
            "11.7\tElly\n" +
            "31.7\tElna\n" +
            "31.7\tElny\n" +
            "30.6\tElof\n" +
            "30.10\tElsa\n" +
            "30.10\tElse\n" +
            "30.10\tElsie\n" +
            "30.10\tElsy\n" +
            "1.3\tElva\n" +
            "1.3\tElvi\n" +
            "1.3\tElvie\n" +
            "1.3\tElvira\n" +
            "1.3\tElvy\n" +
            "19.11\tElzbieta\n" +
            "26.3\tEmanuel\n" +
            "20.4\tEmelia\n" +
            "20.4\tEmelie\n" +
            "23.7\tEmerentia\n" +
            "14.11\tEmil\n" +
            "14.11\tEmilia\n" +
            "14.11\tEmilio\n" +
            "14.11\tEmily\n" +
            "23.7\tEmma\n" +
            "14.11\tEmmy\n" +
            "14.11\tEmy\n" +
            "26.9\tEnar\n" +
            "27.4\tEngelbrekt\n" +
            "19.1\tEnrique\n" +
            "5.5\tErhard\n" +
            "18.5\tErik\n" +
            "24.1\tErika\n" +
            "18.5\tErkki\n" +
            "8.1\tErland\n" +
            "11.10\tErling\n" +
            "2.3\tErna\n" +
            "2.3\tErnesto\n" +
            "2.3\tErnst\n" +
            "6.7\tEsa\n" +
            "6.7\tEsaias\n" +
            "10.5\tEsbjörn\n" +
            "12.6\tEskil\n" +
            "12.6\tEsko\n" +
            "6.7\tEsse\n" +
            "31.3\tEssie\n" +
            "31.3\tEssy\n" +
            "26.12\tEsteban\n" +
            "15.8\tEstelle\n" +
            "26.8\tEsten\n" +
            "31.3\tEster\n" +
            "27.11\tEstrid\n" +
            "10.3\tEthel\n" +
            "5.11\tEugen\n" +
            "5.11\tEugenia\n" +
            "24.12\tEva\n" +
            "3.10\tEvald\n" +
            "24.10\tEve\n" +
            "12.2\tEvelin\n" +
            "12.2\tEvelina\n" +
            "12.2\tEveline\n" +
            "12.2\tEvelyn\n" +
            "24.10\tEvert\n" +
            "12.2\tEvy\n" +
            "20.1\tFabian\n" +
            "9.2\tFanny\n" +
            "28.8\tFatima\n" +
            "18.7\tFederico\n" +
            "14.1\tFelicia\n" +
            "2.5\tFelipe\n" +
            "14.1\tFelix\n" +
            "3.4\tFerdinand\n" +
            "3.4\tFernando\n" +
            "2.5\tFilip\n" +
            "2.5\tFilippa\n" +
            "27.6\tFingal\n" +
            "16.10\tFinn\n" +
            "14.7\tFolke\n" +
            "9.2\tFrancesca\n" +
            "4.10\tFrancesco\n" +
            "4.10\tFrancis\n" +
            "4.10\tFrancisco\n" +
            "9.2\tFranciska\n" +
            "4.10\tFranco\n" +
            "4.10\tFrank\n" +
            "4.10\tFranklin\n" +
            "4.10\tFrans\n" +
            "4.10\tFranz\n" +
            "18.7\tFred\n" +
            "18.7\tFreddie\n" +
            "18.7\tFreddy\n" +
            "18.7\tFredrik\n" +
            "19.9\tFredrika\n" +
            "23.1\tFrej\n" +
            "23.1\tFreja\n" +
            "18.2\tFrida\n" +
            "12.1\tFrideborg\n" +
            "12.1\tFridolf\n" +
            "18.7\tFriedrich\n" +
            "18.2\tFritiof\n" +
            "18.7\tFritz\n" +
            "24.3\tGabriel\n" +
            "19.2\tGabriella\n" +
            "19.2\tGabrielle\n" +
            "19.2\tGaby\n" +
            "23.4\tGeorg\n" +
            "23.4\tGeorge\n" +
            "23.4\tGeorges\n" +
            "23.4\tGeorgina\n" +
            "23.4\tGeorgios\n" +
            "23.4\tGeorgius\n" +
            "23.3\tGerd\n" +
            "23.3\tGerda\n" +
            "24.9\tGerhard\n" +
            "19.6\tGermund\n" +
            "24.9\tGert\n" +
            "17.3\tGerti\n" +
            "17.3\tGertie\n" +
            "17.3\tGertrud\n" +
            "17.3\tGerty\n" +
            "16.3\tGilbert\n" +
            "7.9\tGina\n" +
            "27.12\tGiovanni\n" +
            "4.9\tGisela\n" +
            "7.10\tGit\n" +
            "7.10\tGittan\n" +
            "19.3\tGiuseppe\n" +
            "22.4\tGlenn\n" +
            "15.12\tGottfrid\n" +
            "15.12\tGottfrida\n" +
            "5.5\tGotthard\n" +
            "13.3\tGreger\n" +
            "13.3\tGregor\n" +
            "13.3\tGregorius\n" +
            "13.3\tGrels\n" +
            "20.7\tGret\n" +
            "20.7\tGreta\n" +
            "20.7\tGretchen\n" +
            "20.7\tGrete\n" +
            "20.7\tGretel\n" +
            "3.6\tGudmar\n" +
            "2.4\tGudmund\n" +
            "24.11\tGudrun\n" +
            "6.4\tGuillermo\n" +
            "24.11\tGuje\n" +
            "30.1\tGulla\n" +
            "30.1\tGullan\n" +
            "30.1\tGulli\n" +
            "30.1\tGullie\n" +
            "30.1\tGully\n" +
            "1.6\tGun\n" +
            "3.3\tGunborg\n" +
            "3.3\tGunda\n" +
            "9.1\tGunde\n" +
            "30.1\tGundel\n" +
            "9.1\tGunder\n" +
            "30.1\tGunhild\n" +
            "30.1\tGunilla\n" +
            "9.1\tGunnar\n" +
            "1.6\tGunnel\n" +
            "30.1\tGunnela\n" +
            "30.1\tGunni\n" +
            "30.1\tGunnie\n" +
            "30.1\tGunnil\n" +
            "30.1\tGunnila\n" +
            "30.1\tGunny\n" +
            "3.3\tGunvor\n" +
            "28.8\tGurly\n" +
            "6.6\tGustav\n" +
            "6.11\tGustav\n" +
            "6.6\tGustava\n" +
            "7.1\tGusten\n" +
            "7.1\tGusti\n" +
            "9.1\tGünther\n" +
            "23.4\tGyörgy\n" +
            "23.4\tGöran\n" +
            "19.6\tGörel\n" +
            "6.6\tGösta\n" +
            "27.1\tGöta\n" +
            "27.1\tGöte\n" +
            "27.1\tGötilda\n" +
            "14.6\tHakon\n" +
            "14.6\tHakvin\n" +
            "14.5\tHalvar\n" +
            "14.5\tHalvard\n" +
            "14.5\tHalvor\n" +
            "29.8\tHampus\n" +
            "5.1\tHanna\n" +
            "5.1\tHanne\n" +
            "5.1\tHannele\n" +
            "27.12\tHannes\n" +
            "27.12\tHannu\n" +
            "5.1\tHanny\n" +
            "29.8\tHans\n" +
            "1.4\tHarald\n" +
            "1.4\tHarold\n" +
            "10.10\tHarri\n" +
            "10.10\tHarriet\n" +
            "10.10\tHarry\n" +
            "29.8\tHasse\n" +
            "15.10\tHedda\n" +
            "15.10\tHeddy\n" +
            "15.10\tHedvig\n" +
            "5.9\tHeidi\n" +
            "19.1\tHeikki\n" +
            "19.1\tHeine\n" +
            "19.1\tHeinrich\n" +
            "19.1\tHeinz\n" +
            "31.7\tHelen\n" +
            "31.7\tHelena\n" +
            "31.7\tHelene\n" +
            "21.11\tHelga\n" +
            "30.9\tHelge\n" +
            "30.9\tHelgo\n" +
            "21.11\tHella\n" +
            "21.11\tHelle\n" +
            "31.7\tHelli\n" +
            "31.7\tHelly\n" +
            "26.5\tHelma\n" +
            "16.1\tHelmer\n" +
            "26.5\tHelmina\n" +
            "6.4\tHelmy\n" +
            "31.7\tHelna\n" +
            "11.9\tHelny\n" +
            "15.10\tHelvig\n" +
            "22.5\tHemming\n" +
            "22.5\tHenning\n" +
            "22.8\tHenny\n" +
            "19.1\tHenri\n" +
            "22.8\tHenrietta\n" +
            "22.8\tHenriette\n" +
            "19.1\tHenrik\n" +
            "22.8\tHenrika\n" +
            "19.1\tHenry\n" +
            "16.3\tHerbert\n" +
            "12.7\tHerman\n" +
            "12.7\tHermina\n" +
            "12.7\tHermine\n" +
            "3.4\tHernan\n" +
            "1.4\tHervor\n" +
            "18.1\tHilda\n" +
            "18.1\tHilde\n" +
            "17.9\tHildegard\n" +
            "15.10\tHildevig\n" +
            "21.2\tHilding\n" +
            "18.1\tHildur\n" +
            "15.10\tHill\n" +
            "15.10\tHillevi\n" +
            "15.10\tHilly\n" +
            "26.5\tHilma\n" +
            "15.10\tHilvi\n" +
            "16.1\tHjalmar\n" +
            "3.2\tHjördis\n" +
            "30.3\tHolger\n" +
            "30.3\tHolmfrid\n" +
            "3.11\tHubert\n" +
            "3.11\tHugo\n" +
            "8.9\tHulda\n" +
            "14.6\tHåkan\n" +
            "14.6\tHåkon\n" +
            "3.5\tIan\n" +
            "25.7\tIb\n" +
            "14.9\tIda\n" +
            "10.4\tIgor\n" +
            "31.7\tIlona\n" +
            "30.10\tIlse\n" +
            "26.3\tImmanuel\n" +
            "27.10\tIna\n" +
            "6.8\tInez\n" +
            "25.10\tInga\n" +
            "25.10\tIngalill\n" +
            "10.4\tIngar\n" +
            "27.4\tIngbert\n" +
            "11.2\tInge\n" +
            "28.5\tIngeborg\n" +
            "7.11\tIngegerd\n" +
            "7.11\tIngela\n" +
            "2.4\tIngeman\n" +
            "3.6\tIngemar\n" +
            "2.4\tIngemund\n" +
            "9.10\tInger\n" +
            "11.2\tIngo\n" +
            "9.10\tIngrid\n" +
            "10.4\tIngvar\n" +
            "10.4\tIngvor\n" +
            "9.10\tInkeri\n" +
            "27.12\tIoannis\n" +
            "5.4\tIren\n" +
            "5.4\tIrena\n" +
            "5.4\tIrene\n" +
            "5.4\tIrina\n" +
            "10.2\tIris\n" +
            "5.4\tIrja\n" +
            "7.4\tIrma\n" +
            "7.4\tIrmeli\n" +
            "7.4\tIrmelin\n" +
            "7.4\tIrmgard\n" +
            "30.10\tIsa\n" +
            "30.10\tIsabell\n" +
            "30.10\tIsabella\n" +
            "30.10\tIsabelle\n" +
            "19.12\tIsak\n" +
            "20.12\tIsrael\n" +
            "26.12\tIstvan\n" +
            "24.5\tIvan\n" +
            "31.1\tIvar\n" +
            "25.7\tJaakko\n" +
            "25.7\tJack\n" +
            "25.7\tJacqueline\n" +
            "25.7\tJacques\n" +
            "25.7\tJaime\n" +
            "25.7\tJakob\n" +
            "25.7\tJames\n" +
            "11.1\tJan\n" +
            "3.5\tJane\n" +
            "21.7\tJanet\n" +
            "21.7\tJanna\n" +
            "11.1\tJanne\n" +
            "21.7\tJannie\n" +
            "11.1\tJannika\n" +
            "11.1\tJannike\n" +
            "27.12\tJanos\n" +
            "11.10\tJarl\n" +
            "27.12\tJean\n" +
            "29.5\tJeanette\n" +
            "21.7\tJeanna\n" +
            "21.7\tJeanne\n" +
            "15.12\tJeff\n" +
            "21.7\tJen\n" +
            "6.10\tJenni\n" +
            "6.10\tJennie\n" +
            "6.10\tJennifer\n" +
            "6.10\tJenny\n" +
            "29.3\tJens\n" +
            "25.7\tJeppe\n" +
            "18.5\tJerk\n" +
            "18.5\tJerker\n" +
            "26.7\tJesper\n" +
            "6.7\tJessika\n" +
            "16.2\tJill\n" +
            "25.7\tJim\n" +
            "25.7\tJimi\n" +
            "25.7\tJimmie\n" +
            "25.7\tJimmy\n" +
            "20.3\tJoakim\n" +
            "31.1\tJoar\n" +
            "20.3\tJockum\n" +
            "13.7\tJoel\n" +
            "27.12\tJoen\n" +
            "27.12\tJohan\n" +
            "21.7\tJohanna\n" +
            "21.7\tJohanne\n" +
            "27.12\tJohannes\n" +
            "3.5\tJohn\n" +
            "27.12\tJohnnie\n" +
            "27.12\tJohnny\n" +
            "21.8\tJon\n" +
            "29.3\tJonas\n" +
            "22.12\tJonatan\n" +
            "21.8\tJonna\n" +
            "27.12\tJonne\n" +
            "23.4\tJorge\n" +
            "19.3\tJosé\n" +
            "19.3\tJosef\n" +
            "19.3\tJosefin\n" +
            "19.3\tJosefina\n" +
            "19.3\tJosefine\n" +
            "27.12\tJuan\n" +
            "13.7\tJudit\n" +
            "27.12\tJuha\n" +
            "27.12\tJuhani\n" +
            "27.12\tJuho\n" +
            "27.12\tJukka\n" +
            "16.2\tJulia\n" +
            "16.2\tJuliana\n" +
            "16.2\tJulie\n" +
            "16.2\tJuliette\n" +
            "16.2\tJulio\n" +
            "16.2\tJulius\n" +
            "27.12\tJussi\n" +
            "2.9\tJustina\n" +
            "2.9\tJustus\n" +
            "13.7\tJutta\n" +
            "9.7\tJürgen\n" +
            "13.7\tJytte\n" +
            "27.12\tJöns\n" +
            "9.7\tJörgen\n" +
            "9.7\tJörn\n" +
            "28.1\tKaarlo\n" +
            "13.8\tKaj\n" +
            "2.8\tKaja\n" +
            "2.8\tKajsa\n" +
            "28.1\tKalle\n" +
            "2.8\tKaren\n" +
            "2.8\tKari\n" +
            "2.8\tKarin\n" +
            "28.1\tKarl\n" +
            "28.1\tKarla\n" +
            "2.8\tKarna\n" +
            "20.5\tKarolin\n" +
            "20.5\tKarolina\n" +
            "28.1\tKaroly\n" +
            "13.11\tKarsten\n" +
            "6.1\tKasper\n" +
            "13.11\tKasten\n" +
            "25.11\tKatarina\n" +
            "25.11\tKatarzyna\n" +
            "25.11\tKate\n" +
            "25.11\tKathy\n" +
            "25.11\tKatinka\n" +
            "25.11\tKatja\n" +
            "25.11\tKatri\n" +
            "25.11\tKatrin\n" +
            "22.3\tKen\n" +
            "22.3\tKennet\n" +
            "22.3\tKennie\n" +
            "22.3\tKenny\n" +
            "22.3\tKent\n" +
            "24.7\tKersti\n" +
            "24.7\tKerstin\n" +
            "17.3\tKerttu\n" +
            "8.7\tKettil\n" +
            "25.11\tKetty\n" +
            "22.3\tKevin\n" +
            "7.9\tKevin\n" +
            "24.7\tKickan\n" +
            "24.7\tKicki\n" +
            "20.3\tKim\n" +
            "24.7\tKirsten\n" +
            "24.7\tKirsti\n" +
            "25.11\tKitty\n" +
            "8.7\tKjell\n" +
            "12.8\tKlara\n" +
            "7.7\tKlas\n" +
            "7.7\tKlaus\n" +
            "23.11\tKlemens\n" +
            "13.1\tKnut\n" +
            "12.11\tKonrad\n" +
            "21.5\tKonstantia\n" +
            "21.5\tKonstantin\n" +
            "13.11\tKristen\n" +
            "13.11\tKrister\n" +
            "13.11\tKristian\n" +
            "24.7\tKristin\n" +
            "24.7\tKristina\n" +
            "15.3\tKristoffer\n" +
            "12.11\tKuno\n" +
            "12.11\tKurt\n" +
            "25.11\tKäthe\n" +
            "27.2\tLage\n" +
            "27.2\tLago\n" +
            "5.7\tLaila\n" +
            "2.10\tLajos\n" +
            "15.1\tLalla\n" +
            "15.1\tLarry\n" +
            "10.8\tLars\n" +
            "10.8\tLasse\n" +
            "15.1\tLaura\n" +
            "15.1\tLaurens\n" +
            "15.1\tLaurentia\n" +
            "15.1\tLaurentius\n" +
            "15.1\tLauri\n" +
            "15.1\tLaurina\n" +
            "15.1\tLauritz\n" +
            "27.2\tLave\n" +
            "15.1\tLawrence\n" +
            "26.6\tLea\n" +
            "30.6\tLeif\n" +
            "28.8\tLeila\n" +
            "18.8\tLena\n" +
            "18.8\tLene\n" +
            "18.8\tLenita\n" +
            "28.9\tLennart\n" +
            "28.9\tLennie\n" +
            "28.9\tLenny\n" +
            "28.6\tLeo\n" +
            "28.6\tLeon\n" +
            "28.9\tLeonard\n" +
            "11.7\tLeonor\n" +
            "11.7\tLeonora\n" +
            "15.11\tLeopold\n" +
            "6.9\tLilian\n" +
            "19.11\tLill\n" +
            "18.11\tLillemor\n" +
            "6.9\tLillie\n" +
            "6.9\tLilly\n" +
            "20.5\tLina\n" +
            "20.6\tLinda\n" +
            "20.5\tLine\n" +
            "13.5\tLinn\n" +
            "13.5\tLinnea\n" +
            "26.11\tLinus\n" +
            "19.11\tLis\n" +
            "20.9\tLisa\n" +
            "19.11\tLisbet\n" +
            "20.9\tLise\n" +
            "19.11\tLisen\n" +
            "19.11\tLisette\n" +
            "19.11\tLissi\n" +
            "19.11\tLissie\n" +
            "19.11\tLissy\n" +
            "12.4\tLiv\n" +
            "19.11\tLiz\n" +
            "19.11\tLizette\n" +
            "19.11\tLizzi\n" +
            "19.11\tLizzie\n" +
            "19.11\tLizzy\n" +
            "29.10\tLola\n" +
            "22.7\tLone\n" +
            "15.1\tLorentz\n" +
            "12.5\tLotta\n" +
            "12.5\tLotte\n" +
            "12.5\tLotten\n" +
            "12.5\tLottie\n" +
            "25.8\tLou\n" +
            "2.10\tLouis\n" +
            "25.8\tLouisa\n" +
            "25.8\tLouise\n" +
            "25.8\tLova\n" +
            "2.10\tLove\n" +
            "25.8\tLovisa\n" +
            "25.8\tLovise\n" +
            "13.12\tLucia\n" +
            "13.12\tLucie\n" +
            "2.10\tLudvig\n" +
            "2.10\tLuis\n" +
            "25.8\tLuisa\n" +
            "25.8\tLuise\n" +
            "18.10\tLukas\n" +
            "3.12\tLydia\n" +
            "22.7\tMadeleine\n" +
            "22.7\tMagda\n" +
            "22.7\tMagdalena\n" +
            "20.7\tMaggie\n" +
            "17.9\tMagna\n" +
            "17.9\tMagne\n" +
            "17.9\tMagnhild\n" +
            "19.8\tMagnus\n" +
            "28.2\tMaisie\n" +
            "20.7\tMait\n" +
            "19.5\tMaj\n" +
            "28.2\tMaja\n" +
            "19.5\tMajken\n" +
            "28.2\tMajli\n" +
            "8.6\tMajvor\n" +
            "10.12\tMalena\n" +
            "10.12\tMalene\n" +
            "10.12\tMalin\n" +
            "28.3\tMalkolm\n" +
            "22.7\tMalla\n" +
            "28.11\tMalte\n" +
            "26.10\tManda\n" +
            "26.10\tMandis\n" +
            "12.10\tManfred\n" +
            "12.10\tManfrid\n" +
            "28.2\tManja\n" +
            "26.3\tManne\n" +
            "26.3\tManuel\n" +
            "26.3\tManuela\n" +
            "25.4\tMarco\n" +
            "20.11\tMaren\n" +
            "20.7\tMaret\n" +
            "20.7\tMarga\n" +
            "20.7\tMargareta\n" +
            "15.6\tMargit\n" +
            "20.7\tMargita\n" +
            "15.6\tMargot\n" +
            "20.7\tMargret\n" +
            "20.7\tMargreta\n" +
            "20.7\tMargrete\n" +
            "20.7\tMarguerite\n" +
            "28.2\tMari\n" +
            "28.2\tMaria\n" +
            "30.4\tMariana\n" +
            "4.4\tMarianne\n" +
            "25.3\tMarie\n" +
            "28.2\tMariella\n" +
            "28.2\tMarielle\n" +
            "28.2\tMarietta\n" +
            "28.2\tMariette\n" +
            "22.10\tMarika\n" +
            "20.11\tMarina\n" +
            "28.2\tMarion\n" +
            "6.5\tMarit\n" +
            "22.10\tMarita\n" +
            "28.2\tMarja\n" +
            "28.2\tMarjatta\n" +
            "28.2\tMarjo\n" +
            "25.4\tMark\n" +
            "25.4\tMarkku\n" +
            "25.4\tMarkus\n" +
            "4.4\tMarlen\n" +
            "4.4\tMarlene\n" +
            "27.7\tMarta\n" +
            "10.11\tMartin\n" +
            "10.11\tMartina\n" +
            "10.11\tMartine\n" +
            "10.11\tMartinus\n" +
            "10.11\tMartti\n" +
            "28.2\tMary\n" +
            "14.3\tMatilda\n" +
            "14.3\tMatilde\n" +
            "24.2\tMats\n" +
            "21.9\tMatteus\n" +
            "24.2\tMatti\n" +
            "24.2\tMattias\n" +
            "24.2\tMattis\n" +
            "14.3\tMatty\n" +
            "14.3\tMaud\n" +
            "22.9\tMaurits\n" +
            "1.2\tMax\n" +
            "1.2\tMaximilian\n" +
            "28.2\tMay\n" +
            "20.7\tMeit\n" +
            "6.1\tMelchior\n" +
            "6.1\tMelker\n" +
            "11.5\tMerete\n" +
            "11.5\tMerit\n" +
            "20.7\tMeta\n" +
            "28.2\tMia\n" +
            "29.9\tMichel\n" +
            "29.9\tMichelle\n" +
            "29.9\tMickel\n" +
            "29.9\tMiguel\n" +
            "29.9\tMikael\n" +
            "29.9\tMikaela\n" +
            "29.9\tMike\n" +
            "29.9\tMikko\n" +
            "14.3\tMilda\n" +
            "14.11\tMillan\n" +
            "14.11\tMille\n" +
            "14.11\tMilly\n" +
            "28.2\tMimmi\n" +
            "28.2\tMimmie\n" +
            "26.5\tMina\n" +
            "26.5\tMinna\n" +
            "26.5\tMinnie\n" +
            "28.2\tMirja\n" +
            "1.7\tMirjam\n" +
            "18.11\tMoa\n" +
            "19.8\tMogens\n" +
            "22.9\tMoje\n" +
            "28.2\tMolly\n" +
            "4.5\tMona\n" +
            "4.5\tMonika\n" +
            "4.5\tMonique\n" +
            "28.3\tMorgan\n" +
            "22.9\tMoritz\n" +
            "20.12\tMoses\n" +
            "19.8\tMåns\n" +
            "11.11\tMårten\n" +
            "11.5\tMäret\n" +
            "11.5\tMärit\n" +
            "11.5\tMärta\n" +
            "8.4\tNadja\n" +
            "17.11\tNaemi\n" +
            "17.11\tNaima\n" +
            "17.11\tNaimi\n" +
            "3.4\tNanna\n" +
            "30.11\tNanne\n" +
            "17.11\tNaomi\n" +
            "29.12\tNatali\n" +
            "29.12\tNatalia\n" +
            "29.12\tNatalie\n" +
            "22.12\tNatan\n" +
            "22.12\tNatanael\n" +
            "29.12\tNatasha\n" +
            "13.5\tNea\n" +
            "11.7\tNellie\n" +
            "11.7\tNelly\n" +
            "21.1\tNeta\n" +
            "6.12\tNiklas\n" +
            "6.12\tNikolaus\n" +
            "31.5\tNilla\n" +
            "8.10\tNils\n" +
            "25.11\tNina\n" +
            "24.7\tNinna\n" +
            "13.5\tNinni\n" +
            "13.5\tNinnie\n" +
            "8.10\tNisse\n" +
            "17.11\tNoomi\n" +
            "11.7\tNora\n" +
            "19.4\tOla\n" +
            "19.4\tOlaus\n" +
            "29.7\tOlav\n" +
            "29.7\tOlavi\n" +
            "19.4\tOlavus\n" +
            "21.11\tOlga\n" +
            "15.4\tOliver\n" +
            "15.4\tOlivia\n" +
            "29.7\tOlle\n" +
            "15.4\tOlly\n" +
            "29.7\tOlof\n" +
            "18.9\tOrvar\n" +
            "1.12\tOskar\n" +
            "1.12\tOssian\n" +
            "3.10\tOsvald\n" +
            "9.4\tOtelia\n" +
            "9.4\tOtti\n" +
            "9.4\tOttilia\n" +
            "9.4\tOtto\n" +
            "13.2\tOve\n" +
            "25.1\tPaavo\n" +
            "25.1\tPablo\n" +
            "25.1\tPalle\n" +
            "16.4\tPatricia\n" +
            "16.4\tPatrik\n" +
            "25.1\tPaul\n" +
            "22.6\tPaula\n" +
            "25.1\tPauli\n" +
            "22.6\tPaulina\n" +
            "22.6\tPauline\n" +
            "22.6\tPaulinus\n" +
            "25.1\tPaulus\n" +
            "25.1\tPavel\n" +
            "29.6\tPeder\n" +
            "29.6\tPedro\n" +
            "20.7\tPeggy\n" +
            "29.6\tPekka\n" +
            "1.8\tPelle\n" +
            "21.3\tPentti\n" +
            "1.8\tPer\n" +
            "31.5\tPernilla\n" +
            "31.5\tPernille\n" +
            "11.6\tPertti\n" +
            "29.6\tPeter\n" +
            "29.6\tPetra\n" +
            "29.6\tPetri\n" +
            "31.5\tPetronella\n" +
            "29.6\tPetrus\n" +
            "22.2\tPia\n" +
            "29.6\tPierre\n" +
            "29.6\tPieter\n" +
            "29.6\tPiotr\n" +
            "7.10\tPirjo\n" +
            "7.10\tPirkko\n" +
            "20.11\tPontus\n" +
            "25.1\tPoul\n" +
            "25.1\tPål\n" +
            "24.3\tRafael\n" +
            "1.10\tRagna\n" +
            "1.10\tRagnar\n" +
            "15.7\tRagnhild\n" +
            "15.7\tRagni\n" +
            "15.7\tRagnvald\n" +
            "15.7\tRagny\n" +
            "1.10\tRainer\n" +
            "26.6\tRakel\n" +
            "27.3\tRalf\n" +
            "27.8\tRaoul\n" +
            "26.10\tRasmus\n" +
            "15.7\tRauni\n" +
            "1.10\tRauno\n" +
            "17.5\tRebecka\n" +
            "7.9\tRegine\n" +
            "9.5\tReidar\n" +
            "9.5\tReidun\n" +
            "13.3\tReijo\n" +
            "16.7\tReine\n" +
            "1.10\tReiner\n" +
            "16.7\tReinhold\n" +
            "16.7\tReino\n" +
            "7.2\tRicky\n" +
            "27.9\tRigmor\n" +
            "7.10\tRiitta\n" +
            "4.7\tRika\n" +
            "7.2\tRikard\n" +
            "13.11\tRisto\n" +
            "6.5\tRita\n" +
            "5.7\tRitva\n" +
            "7.6\tRobert\n" +
            "7.6\tRoberto\n" +
            "7.6\tRobin\n" +
            "2.6\tRoger\n" +
            "9.8\tRoland\n" +
            "27.8\tRolf\n" +
            "16.5\tRonald\n" +
            "16.5\tRonnie\n" +
            "16.5\tRonny\n" +
            "2.7\tRosa\n" +
            "2.7\tRosalie\n" +
            "2.7\tRosi\n" +
            "2.7\tRosie\n" +
            "2.7\tRosina\n" +
            "2.7\tRosine\n" +
            "2.7\tRosita\n" +
            "7.9\tRoy\n" +
            "17.5\tRuben\n" +
            "27.3\tRudolf\n" +
            "24.11\tRuna\n" +
            "24.11\tRune\n" +
            "24.11\tRuno\n" +
            "7.6\tRupert\n" +
            "4.1\tRut\n" +
            "2.6\tRutger\n" +
            "27.10\tSabina\n" +
            "27.10\tSabine\n" +
            "19.7\tSalli\n" +
            "19.7\tSally\n" +
            "25.6\tSalomon\n" +
            "1.9\tSam\n" +
            "1.9\tSammy\n" +
            "1.9\tSamuel\n" +
            "12.12\tSander\n" +
            "17.2\tSandra\n" +
            "11.8\tSanna\n" +
            "11.8\tSanny\n" +
            "12.12\tSante\n" +
            "19.7\tSara\n" +
            "20.1\tSebastian\n" +
            "4.2\tSelm\n" +
            "27.6\tSelma\n" +
            "4.2\tSelmer\n" +
            "30.12\tSet\n" +
            "28.7\tSeve\n" +
            "28.7\tSeved\n" +
            "23.10\tSeverin\n" +
            "23.10\tSeverina\n" +
            "20.10\tSibyl\n" +
            "20.10\tSibylla\n" +
            "15.9\tSickan\n" +
            "10.1\tSigbritt\n" +
            "15.2\tSigfrid\n" +
            "15.9\tSigga\n" +
            "10.1\tSigge\n" +
            "23.8\tSignar\n" +
            "23.8\tSigne\n" +
            "23.8\tSignhild\n" +
            "23.8\tSigny\n" +
            "15.9\tSigrid\n" +
            "10.1\tSigurd\n" +
            "25.2\tSigvard\n" +
            "8.8\tSilva\n" +
            "8.8\tSilvana\n" +
            "8.8\tSilvia\n" +
            "28.10\tSimon\n" +
            "28.10\tSimone\n" +
            "15.9\tSiri\n" +
            "22.11\tSissa\n" +
            "22.11\tSissel\n" +
            "22.11\tSissela\n" +
            "22.11\tSissi\n" +
            "8.3\tSiv\n" +
            "25.2\tSivar\n" +
            "25.2\tSivard\n" +
            "25.2\tSivert\n" +
            "14.12\tSixten\n" +
            "15.5\tSofi\n" +
            "15.5\tSofia\n" +
            "15.5\tSofie\n" +
            "4.6\tSolbritt\n" +
            "4.6\tSolveig\n" +
            "4.6\tSolvig\n" +
            "29.11\tSone\n" +
            "15.5\tSonja\n" +
            "29.11\tSonny\n" +
            "26.12\tStaffan\n" +
            "26.12\tStefan\n" +
            "26.12\tStefania\n" +
            "26.12\tStefano\n" +
            "26.12\tStefanus\n" +
            "26.12\tSteffan\n" +
            "26.12\tSteffen\n" +
            "15.8\tStella\n" +
            "14.10\tStellan\n" +
            "14.12\tSten\n" +
            "26.12\tStephanie\n" +
            "26.12\tStephen\n" +
            "26.12\tSteve\n" +
            "17.12\tStig\n" +
            "24.7\tStina\n" +
            "13.9\tSture\n" +
            "10.5\tStyrbjörn\n" +
            "29.11\tSune\n" +
            "11.8\tSusanna\n" +
            "11.8\tSusanne\n" +
            "11.8\tSusie\n" +
            "10.6\tSvante\n" +
            "2.1\tSvea\n" +
            "5.12\tSven\n" +
            "4.11\tSverker\n" +
            "8.8\tSylva\n" +
            "8.8\tSylve\n" +
            "31.12\tSylvester\n" +
            "8.8\tSylvi\n" +
            "8.8\tSylvia\n" +
            "8.8\tSylvie\n" +
            "23.10\tSören\n" +
            "3.8\tTage\n" +
            "8.4\tTanja\n" +
            "26.12\tTapani\n" +
            "8.4\tTatjana\n" +
            "23.9\tTea\n" +
            "9.11\tTed\n" +
            "9.11\tTeddy\n" +
            "23.9\tTekla\n" +
            "9.11\tTeodor\n" +
            "9.11\tTeodora\n" +
            "26.4\tTerese\n" +
            "26.4\tTeresia\n" +
            "9.11\tTheo\n" +
            "14.4\tTiburtius\n" +
            "14.3\tTilda\n" +
            "14.3\tTilde\n" +
            "14.3\tTilly\n" +
            "24.7\tTina\n" +
            "24.7\tTitti\n" +
            "2.11\tTobias\n" +
            "17.10\tToini\n" +
            "21.12\tTom\n" +
            "21.12\tTomas\n" +
            "21.12\tTommi\n" +
            "21.12\tTommie\n" +
            "21.12\tTommy\n" +
            "17.10\tToni\n" +
            "17.1\tTony\n" +
            "19.10\tTor\n" +
            "5.3\tTora\n" +
            "9.3\tTorben\n" +
            "9.3\tTorbjörn\n" +
            "17.6\tTorborg\n" +
            "10.9\tTord\n" +
            "19.10\tTore\n" +
            "10.9\tTorfrid\n" +
            "26.2\tTorgny\n" +
            "12.3\tTori\n" +
            "26.2\tTorkel\n" +
            "9.3\tTorleif\n" +
            "23.2\tTorsten\n" +
            "23.2\tTorun\n" +
            "17.6\tTorvald\n" +
            "5.3\tTova\n" +
            "5.3\tTove\n" +
            "17.3\tTrude\n" +
            "25.9\tTryggve\n" +
            "28.4\tTure\n" +
            "10.9\tTurid\n" +
            "5.3\tTuve\n" +
            "29.4\tTyko\n" +
            "28.4\tTyra\n" +
            "17.1\tTönnes\n" +
            "11.4\tUlf\n" +
            "4.7\tUlla\n" +
            "5.8\tUlrik\n" +
            "4.7\tUlrika\n" +
            "4.7\tUlrike\n" +
            "14.8\tUno\n" +
            "25.5\tUrban\n" +
            "21.10\tUrsula\n" +
            "1.5\tValborg\n" +
            "18.4\tValde\n" +
            "18.4\tValdemar\n" +
            "14.2\tValentin\n" +
            "14.2\tValentina\n" +
            "12.10\tValfrid\n" +
            "12.10\tValfrida\n" +
            "18.4\tValle\n" +
            "14.2\tVally\n" +
            "17.8\tValter\n" +
            "24.5\tVanja\n" +
            "24.4\tVega\n" +
            "8.11\tVendela\n" +
            "30.5\tVera\n" +
            "17.8\tVerna\n" +
            "17.8\tVerner\n" +
            "30.5\tVeronika\n" +
            "16.11\tVibeke\n" +
            "12.3\tVicky\n" +
            "31.8\tVidar\n" +
            "22.1\tViktor\n" +
            "12.3\tViktoria\n" +
            "6.4\tVilhelm\n" +
            "26.5\tVilhelmina\n" +
            "6.4\tViljo\n" +
            "6.4\tVille\n" +
            "6.4\tWilli\n" +
            "6.4\tWilliam\n" +
            "6.4\tVilly\n" +
            "26.5\tVilma\n" +
            "22.1\tVincent\n" +
            "29.10\tViola\n" +
            "29.10\tViolet\n" +
            "29.10\tVioletta\n" +
            "29.10\tViolette\n" +
            "8.12\tVirginia\n" +
            "15.4\tViva\n" +
            "16.11\tVivan\n" +
            "16.11\tViveka\n" +
            "15.10\tVivi\n" +
            "20.2\tViviana\n" +
            "20.2\tVivianne\n" +
            "16.11\tVivika\n" +
            "18.4\tVladimir\n" +
            "11.4\tWolf\n" +
            "18.4\tVolmar\n" +
            "18.4\tVolmer\n" +
            "17.8\tVolter\n" +
            "11.4\tYlva\n" +
            "10.4\tYngvar\n" +
            "11.2\tYngve\n" +
            "23.4\tYrjö\n" +
            "21.10\tYrsa\n" +
            "29.5\tYvette\n" +
            "29.5\tYvonne\n" +
            "19.7\tZarah\n" +
            "8.5\tÅge\n" +
            "5.2\tÅgot\n" +
            "8.5\tÅke\n" +
            "12.9\tÅsa\n" +
            "12.9\tÅse\n" +
            "12.9\tÅslög\n" +
            "9.7\tÖrjan\n" +
            "26.8\tÖsten\n";


    ArrayList<String> stavelser;
    ArrayList<String> randomNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_main);

        bAdd = (Button) findViewById(R.id.bAdd);
        bAverage = (Button) findViewById(R.id.bAverage);
        eName = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);

        eName.setText("");
        stavelser = new ArrayList<String>();
        names = names();
        generateStavelser();

        randomNames = new ArrayList<String>();

        for(int i = 0; i < 50;i++){
            randomNames.add(generateRandomName());

                }

        nAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, randomNames);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eName.getText().toString().length()>0){
                    names.add(eName.getText().toString().toUpperCase());
                    eName.setText("");
                    nAdapter.notifyDataSetChanged();
                }
            }
        });

        listView.setAdapter(nAdapter);

        bAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(names.size() > 0) {
                    String name = generateRandomName();
                    String fixedName = generateRandomName();
                    new AlertDialog.Builder(NameMain.this)
                            .setTitle("Randomnamn")
                            .setMessage("Ett namn skulle kunna vara " + name + "! \n" +
                                    "Eller varför inte " + fixedName + "!")
                            .setPositiveButton("Fortsätt", null)
                            .setNegativeButton("Släng namn", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    names.clear();
                                    nAdapter.notifyDataSetChanged();
                                }
                            }).show();
                }
            }
        });



    }

    private void generateStavelser(){


        for(String n : names){
            String stavelse = new String("");
            boolean vowel = false;
            for(int i = 0; i < n.length(); i++){
                if(isVokal(n.charAt(i))){
                    if(vowel){

                        stavelser.add(stavelse);
                        stavelse = new String("");
                        stavelse += n.charAt(i);
                        vowel = false;
                    }else {
                        vowel = true;
                        stavelse += n.charAt(i);
                    }
                }else{
                    stavelse += n.charAt(i);
                }
            }
            if(stavelse.length() > 0) stavelser.add(stavelse);
        }

    }

    private boolean isVokal(char c){
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' || c == 'Å' || c == 'Ä' || c == 'Ö';

    }

    private String generateFixedName(String name) {
        StringBuilder newName = new StringBuilder();
        if(name.length() == 1) return name;
        if(name.length() == 2){
            newName.append(name.charAt(0));
            newName.append(findClosestWovel(name.charAt(1)));
            return newName.toString();
        }

        for(int i = 0; i < name.length(); i++){
           if(i % 3 == 0){
               newName.append(findClosestWovel(name.charAt(i)));
           }
           else{
               newName.append(name.charAt(i));
           }
        }


        return newName.toString();
    }

    private char findClosestWovel(char c){
        if(c <= 'C') return 'A';
        if(c <= 'G') return 'E';
        if(c <= 'L') return 'I';
        if(c <= 'R') return 'O';
        if(c <= 'W') return 'U';
        return 'Y';
    }

    private String generateAverage() {
        int nameLength = 0;

        for(String s : names){
            nameLength+=s.length();
        }

        nameLength = nameLength / names.size();
        int[] letters = new int[nameLength];


        int j = 0;

        StringBuilder name = new StringBuilder();

        for(int i = 0; i < nameLength; i++){
            int activeLetters = 0;
            for(String s : names){
                if(s.length() > i){
                    letters[i] += (int) s.charAt(i);
                    activeLetters++;
                }
            }
            letters[i] = letters[i] / activeLetters;
            name.append((char) letters[i]);
        }

        return name.toString();

    }


    private String generateRandomName(){

        String name = "";

        Random rand = new Random();
        int numStavelser = rand.nextInt(4)+1;

        for(int i = 0; i < numStavelser; i++){
            int index = rand.nextInt(stavelser.size());
            name += stavelser.get(index);
        }

        return name;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name_main, menu);
        return true;
    }

    private ArrayList<String> names(){
        ArrayList<String> namnList = new ArrayList<String>();

        StringBuilder namnByggare = new StringBuilder();
        boolean buildingName = false;
        for(int i = 0; i < namn.length(); i++){
            char c = namn.charAt(i);
            if(c == 9){ //Tab
                buildingName = true;
                i++;
            }
            if(c == 10){ // new line
                buildingName = false;
                namnList.add(namnByggare.toString().toUpperCase());
                namnByggare = new StringBuilder();
            }
            if(buildingName){
                namnByggare.append(namn.charAt(i));
            }

        }

        return namnList;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
