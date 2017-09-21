import java.util.Arrays;

public class RecursiveTest {

	public static void main(String[] args){
		// Selection sort test cases
		Integer[] array1 = {0, 3, 6, 4, 3, 7, 2, 1, 3, 5, 33, 4, 9, -3, 30, 2};
		Integer[] sorted1 = Selection.recursiveSort(array1);
		
		Double[] array2 = {0.1, 0.2, 0.1, 0.2, 0.3, 0.1, 2.3, 4.002, 2.1, 0.0, 4.001};
		Double[] sorted2 = Selection.recursiveSort(array2);
		
		String[] array3 = {"miscible","expatiate","stroma","ambuscade","palinode","substantively","peculate","sulcated","scath","unipersonal","monkish","sophisticate","quoin","interpolate","bifilar","allude","penicillate","truculent","sensuous","sabre","perceptibility","infraspinous","cabala","cosmical","checkerberry","bipartite","facient","coralline","philhellenist","chopfallen","transmutation","brimstone","scrip","quarantine","missive","capitatim","collet","palaver","maraud","deplorable","unbrace","setaceous","quadratojugal","regency","scutum","amiability","benthamism","penetralia","cadaveric","pettifoggery","encasement","uranic","vanadic","connotation","eversion","lunated","chicory","phantasmagoria","maccabean","suffuse","spright","woful","restive","epileptic","overthwart","rigmarole","tripartite","malefactor","interclude","dieresis","amortization","alcove","immerge","tentative","diametrical","ensue","pusillanimity","inthrall","forelock","melodize","luminiferous","incrassate","abye","heritable","quotidian","vermiculate","deprecate","oestrual","tegmental","anachronism","squab","muss","mesocephalic","deign","exacerbate","posset","recrudescent","rusticity","patriarchate","sumpter","baste","incredulous","meliorate","stellated","chalybeate","anagram","supraoccipital","purl","electrum","cannulated","lacunar","trapan","hoodwink","glase","remunerative","corollary","dimorphous","impoverishment","constabulary","parthenogenesis","ornithology","pontoon","dastard","parietes","protean","gentry","protrusive","decrepitate","heathendom","despumate","precentor","penmanship","silicified","memorialize","caul","parricide","dulcify","obtend","bolter","syzygy","idiocracy","taw","siphonostomata","rankle","stellary","miliary","glycyrrhiza","anisotropic","valvate","tegument","sacrosciatic","ampulla","vendible","lichenography","trinitarian","residuary","austral","hypostasis","diphyodont","bilk","stentor","borrel","edulcorate","promenade","vasodilator","ditty","aberrant","atavism","desperado","unisonant","precocity","atonic","imposthumate","extemporize","phytology","colloid","pugilist","chinchilla","crypt","percolation","parquet","sprit","gammon","decretory","homotype","moresque","epicycle","fundament","saccholactic","seraglio","supine","casuistry","rhapsodist","recantation","metonymy","splanchnology","amyloid"};
		String[] sorted3 = Selection.recursiveSort(array3);
		
		
		// Print results
		System.out.println("Array 1:  " + Arrays.toString(array1));
		System.out.println("Sorted 1: " + Arrays.toString(sorted1));
		System.out.println();
		
		System.out.println("Array 2:  " + Arrays.toString(array2));
		System.out.println("Sorted 2: " + Arrays.toString(sorted2));
		System.out.println();
		
		System.out.println("Array 3:  " + Arrays.toString(array3));
		System.out.println("Sorted 3: " + Arrays.toString(sorted3));
	}
	
}
