package src.org.game.frame;
public class AIlrwx {
	public static int[][] returnArray;
	static int returnArray(int[][] hb,int[][] sb,int[][] box,int step,boolean isMine) {
	    int a;
	    int b;
	    int c;
	    int d;
	    int e;
	    int f;
	    int g;
	    int h;
	    int i = 1;
	    int j = 0;
	    int k = 0;
	    int l = 0;
	    int m = 0;
	    int n = 0;
	    int q = 0;
	    int[] num = new int[30];
	    int[][] boxjudge = new int[5][5];
	    int[][] boxscan = new int[5][5];
	    int[][] judge = new int[5][5];
	    int[][] hbscan = new int[6][5];
	    int[][] sbscan = new int[6][5];
	    int[][] target1 = new int[60][3];
	    for(a=0;a<6;a++){
	    	for(b=0;b<5;b++){
	    		hbscan[a][b] = hb[a][b];
	    	}
	    }
	    for(a=0;a<6;a++){
	    	for(b=0;b<5;b++){
	    		sbscan[a][b] = sb[a][b];
	    	}
	    }
	    for(a=0;a<5;a++){
	    	for(b=0;b<5;b++){
	    		if(box[a][b] != 0){
	    			boxjudge[a][b] =-1;
	    		}
	    	}
	    }
	    for(g=0;g<25;g++){
	    	for(a=0;a<5;a++){
	    		for(b=0;b<5;b++){
	    			if(hbscan[a][b]!=0 && sbscan[b][a]!=0 && hbscan[a+1][b]!=0 && sbscan[b+1][a]==0){
	    				sbscan[b+1][a] = 1;
	    				boxjudge[a][b] = -1;
	    			}
	    			if(hbscan[a][b]!=0 && sbscan[b][a]!=0 && hbscan[a+1][b]==0 && sbscan[b+1][a]!=0){
	    				hbscan[a+1][b] = 1;
	    				boxjudge[a][b] = -1;
	    			}
	    			if(hbscan[a][b]!=0 && sbscan[b][a]==0 && hbscan[a+1][b]!=0 && sbscan[b+1][a]!=0){
	    				sbscan[b][a] = 1;
	    				boxjudge[a][b] = -1;
	    			}
	    			if(hbscan[a][b]==0 && sbscan[b][a]!=0 && hbscan[a+1][b]!=0 && sbscan[b+1][a]!=0){
	    				hbscan[a][b] = 1;
	    				boxjudge[a][b] = -1;
	    			}
	    		}
	    	}
	    }
	    for(a=0;a<6;a++){
	    	for(b=0;b<5;b++){
	    		if(hbscan[a][b] == 0){
	    			hbscan[a][b] = 1;
	    			i=1;
	    			for(c=0;c<6;c++){
	    				for(d=0;d<5;d++){
	    					if(hbscan[c][d] == 0){
	    						hbscan[c][d] = 1;
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								if(!(hbscan[e][f]!=0 && sbscan[f][e]!=0 && hbscan[e+1][f]!=0 && sbscan[f+1][e]!=0 && boxjudge[e][f]!=-1)){
	    									judge[e][f] = 1;
	    								}
	    							}
	    						}
	    						for(e=0;e<5;e++){
	    			    			for(f=0;f<5;f++){
	    			    				if(judge[e][f]==0){
	    			    					i=0;
	    			    				};
	    			    			}
	    			    		}
	    			    		for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								judge[e][f] = 0;
	    							}
	    						}
	    			    	    hbscan[c][d] = 0;
	    					}
	    				}
	    			}
	    			for(c=0;c<6;c++){
	    				for(d=0;d<5;d++){
	    					if(sbscan[c][d] == 0){
	    						sbscan[c][d] = 1;
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								if(!(hbscan[e][f]!=0 && sbscan[f][e]!=0 && hbscan[e+1][f]!=0 && sbscan[f+1][e]!=0 && boxjudge[e][f]!=-1)){
	    									judge[e][f] = 1;
	    								}
	    							}
	    						}
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								if(judge[e][f]==0){
    			    					i=0;
	    								};
	    							}
	    						}
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								judge[e][f] = 0;
	    							}
	    						}
	    			    		sbscan[c][d] = 0;
		    				}
	    				}
	    			}
	    			if(i==1){
	    				target1[j][0] = 0;
	    				target1[j][1] = a;
	    				target1[j][2] = b;
	    				j++;
	    			}
	    			hbscan[a][b] = 0;
	    		}
	    	}
		}

	    for(a=0;a<6;a++){
	    	for(b=0;b<5;b++){
	    		if(sbscan[a][b] == 0){
	    			sbscan[a][b] = 1;
	    			i=1;
	    			for(c=0;c<6;c++){
	    				for(d=0;d<5;d++){
	    					if(hbscan[c][d] == 0){
	    						hbscan[c][d] = 1;
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								if(!(hbscan[e][f]!=0 && sbscan[f][e]!=0 && hbscan[e+1][f]!=0 && sbscan[f+1][e]!=0 && boxjudge[e][f]!=-1)){
	    									judge[e][f] = 1;
	    								}
	    							}
	    						}
	    						for(e=0;e<5;e++){
	    			    			for(f=0;f<5;f++){
	    			    				if(judge[e][f]==0){
	    			    					i=0;
	    			    				};
	    			    			}
	    			    		}
	    			    		for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								judge[e][f] = 0;
	    							}
	    						}
	    			    	    hbscan[c][d] = 0;
	    					}
	    				}
	    			}
	    			for(c=0;c<6;c++){
	    				for(d=0;d<5;d++){
	    					if(sbscan[c][d] == 0){
	    						sbscan[c][d] = 1;
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								if(!(hbscan[e][f]!=0 && sbscan[f][e]!=0 && hbscan[e+1][f]!=0 && sbscan[f+1][e]!=0 && boxjudge[e][f]!=-1)){
	    									judge[e][f] = 1;
	    								}
	    							}
	    						}
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								if(judge[e][f]==0){
    			    					i=0;
	    								};
	    							}
	    						}
	    						for(e=0;e<5;e++){
	    							for(f=0;f<5;f++){
	    								judge[e][f] = 0;
	    							}
	    						}
	    			    		sbscan[c][d] = 0;
		    				}
	    				}
	    			}
	    			if(i==1){
	    				target1[j][0] = 1;
	    				target1[j][1] = a;
	    				target1[j][2] = b;
	    				j++;
	    			}
	    			sbscan[a][b] = 0;
	    		}
	    	}
		}
	    for(a=0;a<6;a++){
	    	for(b=0;b<5;b++){
	    		hbscan[a][b] = hb[a][b];
	    	}
	    }
	    for(a=0;a<6;a++){
	    	for(b=0;b<5;b++){
	    		sbscan[a][b] = sb[a][b];
	    	}
	    }
	    for(a=0;a<5;a++){
	    	for(b=0;b<5;b++){
	    		if(box[a][b] != 0){
	    			boxjudge[a][b] =-1;
	    		}
	    		else{
	    			boxjudge[a][b] =0;
	    		}
	    	}
	    }
	    if(j<=0){							//这是已到达A状态时的做法。
	    	for(a=0;a<5;a++){
		    	for(b=0;b<5;b++){
		    		if(box[a][b]!=0 || (hb[a][b]==0 && hb[a+1][b]==0 && sb[b][a]==0 && sb[b+1][a]==0) || (hb[a][b]!=0 && hb[a+1][b]==0 && sb[b][a]==0 && sb[b+1][a]==0) || (hb[a][b]==0 && hb[a+1][b]!=0 && sb[b][a]==0 && sb[b+1][a]==0) || (hb[a][b]==0 && hb[a+1][b]==0 && sb[b][a]!=0 && sb[b+1][a]==0) || (hb[a][b]==0 && hb[a+1][b]==0 && sb[b][a]==0 && sb[b+1][a]!=0)){
		    			boxjudge[a][b] =-1;
		    		}
		    		else{
		    			boxjudge[a][b] = 0;
		    		}
		    	}
		    }
	    	for(a=0;a<5;a++){
	    		for(b=0;b<5;b++){
	    			if(boxjudge[a][b] == 0){
	    				boxscan[a][b] = 5 * a + b + 1;
	    			}
	    			else{
	    				boxscan[a][b] = -1;
	    			}
	    		}
	    	}
	    	for(h=0;h<20;h++){
	    		for(a=0;a<5;a++){
	    			for(b=0;b<4;b++){
	    				if(boxscan[a][b]!=-1 && boxscan[a][b+1]!=-1 && sb[b+1][a]==0){
	    					if(boxscan[a][b] <= boxscan[a][b+1]){
	    						boxscan[a][b+1] = boxscan[a][b];
	    					}
	    					else{
	    						boxscan[a][b] = boxscan[a][b+1];
	    					}
	    				}
	    			}
	    		}
	    		for(a=0;a<4;a++){
	    			for(b=0;b<5;b++){
	    				if(boxscan[a][b]!=-1 && boxscan[a+1][b]!=-1 && hb[a+1][b]==0){
	    					if(boxscan[a][b] <= boxscan[a+1][b]){
	    						boxscan[a+1][b] = boxscan[a][b];
	    					}
	    					else{
	    						boxscan[a][b] = boxscan[a+1][b];
	    					}
	    				}
	    			}
	    		}
	    	}
	    	for(h=1;h<26;h++){
	    		for(a=0;a<5;a++){
	    			for(b=0;b<5;b++){
	    				if(boxscan[a][b] == h){
	    					num[h]++;
	    				}
	    			}
	    		}
	    	}
	    	for(a=0;a<5;a++){
    			for(b=0;b<5;b++){
    				if(boxscan[a][b]!=-1){
    					n=boxscan[a][b];
    				}
    			}
    		}
    		for(a=0;a<5;a++){
    			for(b=0;b<5;b++){
    				if(boxscan[a][b]!=-1){
    					if(boxscan[a][b] != n){
    						l++;
    					}
    				}
    			}
    		}
    		if(l == 0){				//盘面上剩余一组。
    			for(a=0;a<5;a++){
        			for(b=0;b<5;b++){
        				if(boxscan[a][b]!=-1 || box[a][b]==2){
        					l++;
        				}
        			}
        		}
    			if(l<=12){
    				for(c=0;c<6;c++){
    					for(d=0;d<5;d++){
    						hb[c][d] = 0;
    						sb[c][d] = 0;
    					}
    				}
    				for(c=0;c<5;c++){
    					for(d=0;d<5;d++){
    						box[c][d] = 0;
    					}
    				}
    				q = 1;
    			}
    		}
	    	if(l == 1){			//盘面上剩余两组。
	   			h=0;
		    	for(a=0;a<5;a++){
		    		for(b=0;b<5;b++){
		    			if((hb[a][b]==0&&sb[b][a]!=0&&hb[a+1][b]!=0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]==0&&hb[a+1][b]!=0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]!=0&&hb[a+1][b]==0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]!=0&&hb[a+1][b]!=0&&sb[b+1][a]==0)){
		    				h++;
		    			}
		    		}
		    	}
		    	if(h == 2){				//有2个3的情况。
		    		for(a=0;a<5;a++){
			    		for(b=0;b<5;b++){
			    			if((hb[a][b]==0&&sb[b][a]!=0&&hb[a+1][b]!=0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]==0&&hb[a+1][b]!=0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]!=0&&hb[a+1][b]==0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]!=0&&hb[a+1][b]!=0&&sb[b+1][a]==0)){
			    				if(k == 0){
			    					k = boxscan[a][b];
			    				}
			    				else{
			    					if(boxscan[a][b] != k){
			    						m++;
			    					}
			    				}
			    			}
			    		}
			    	}
		    		if(m == 0){			//这2个3在1组
		    			for(a=0;a<5;a++){
				    		for(b=0;b<5;b++){
				    			if((hb[a][b]==0&&sb[b][a]!=0&&hb[a+1][b]!=0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]==0&&hb[a+1][b]!=0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]!=0&&hb[a+1][b]==0&&sb[b+1][a]!=0)||(hb[a][b]!=0&&sb[b][a]!=0&&hb[a+1][b]!=0&&sb[b+1][a]==0)){
				    				k = boxscan[a][b];
				    			}
				    		}
				    	}
		    			for(a=0;a<5;a++){
				    		for(b=0;b<5;b++){
				    			if(boxscan[a][b]==k ||box[a][b]==2){
				    				l++;
				    			}
				    		}
				    	}
		    			if(l<=12){
		    				for(c=0;c<6;c++){
		    					for(d=0;d<5;d++){
		    						hb[c][d] = 0;
		    						sb[c][d] = 0;
		    					}
		    				}
		    				for(c=0;c<5;c++){
		    					for(d=0;d<5;d++){
		    						box[c][d] = 0;
		    					}
		    				}
		    				q = 1;
		    			}
		    		}
		    		else{				//这两个3在2组
		    			for(a=0;a<5;a++){
		        			for(b=0;b<5;b++){
		        				if(boxscan[a][b]!=-1 || box[a][b]==2){
		        					l++;
		        				}
		        			}
		        		}
		    			if(l<=12){
		    				for(c=0;c<6;c++){
		    					for(d=0;d<5;d++){
		    						hb[c][d] = 0;
		    						sb[c][d] = 0;
		    					}
		    				}
		    				for(c=0;c<5;c++){
		    					for(d=0;d<5;d++){
		    						box[c][d] = 0;
		    					}
		    				}
		    				q = 1;
		    			}
		    		}
		    	}
	    	}
	   	}
		return q;
	}
}
