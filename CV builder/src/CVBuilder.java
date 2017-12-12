import java.awt.EventQueue;
import javax.swing.*;

public class CVBuilder extends JFrame {
	public CVBuilder() {
	}
	public static void main(String args[]) {
		CVBuilder temp = new Info();
		System.out.println("\\documentclass[paper=a4,fontsize=11pt]{scrartcl} 						\r\n" + 
				"\\usepackage[english]{babel}\r\n" + 
				"\\usepackage[utf8x]{inputenc}\r\n" + 
				"\\usepackage[protrusion=true,expansion=true]{microtype}\r\n" + 
				"\\usepackage{amsmath,amsfonts,amsthm}     % Math packages\r\n" + 
				"\\usepackage{graphicx}                    % Enable pdflatex\r\n" + 
				"\\usepackage[svgnames]{xcolor}            % Colors by their 'svgnames'\r\n" + 
				"\\usepackage{geometry}\r\n" + 
				"	\\textheight=700px                    \r\n" + 
				"\\usepackage{url}\r\n" + 
				"\r\n" + 
				"\\frenchspacing              \r\n" + 
				"\\pagestyle{empty}           \r\n" + 
				"\r\n" + 
				"%%% Custom sectioning (sectsty package)\r\n" + 
				"%%% ------------------------------------------------------------\r\n" + 
				"\\usepackage{sectsty}\r\n" + 
				"\r\n" + 
				"\\sectionfont{%			            % Change font of \\section command\r\n" + 
				"	\\usefont{OT1}{phv}{b}{n}%		% bch-b-n: CharterBT-Bold font\r\n" + 
				"	\\sectionrule{0pt}{0pt}{-5pt}{3pt}}\r\n" + 
				"\r\n" + 
				"%%% Macros\r\n" + 
				"%%% ------------------------------------------------------------\r\n" + 
				"\\newlength{\\spacebox}\r\n" + 
				"\\settowidth{\\spacebox}{8888888888}			% Box to align text\r\n" + 
				"\\newcommand{\\sepspace}{\\vspace*{1em}}		% Vertical space macro\r\n" + 
				"\r\n" + 
				"\\newcommand{\\MyName}[1]{ % Name\r\n" + 
				"		\\Huge \\usefont{OT1}{phv}{b}{n} \\hfill #1\r\n" + 
				"		\\par \\normalsize \\normalfont}\r\n" + 
				"		\r\n" + 
				"\\newcommand{\\MySlogan}[1]{ % Slogan (optional)\r\n" + 
				"		\\large \\usefont{OT1}{phv}{m}{n}\\hfill \\textit{#1}\r\n" + 
				"		\\par \\normalsize \\normalfont}\r\n" + 
				"\r\n" + 
				"\\newcommand{\\NewPart}[1]{\\section*{\\uppercase{#1}}}\r\n" + 
				"\r\n" + 
				"\\newcommand{\\PersonalEntry}[2]{\r\n" + 
				"		\\noindent\\hangindent=2em\\hangafter=0 % Indentation\r\n" + 
				"		\\parbox{\\spacebox}{        % Box to align text\r\n" + 
				"		\\textit{#1}}		       % Entry name (birth, address, etc.)\r\n" + 
				"		\\hspace{1.5em} #2 \\par}    % Entry value\r\n" + 
				"\r\n" + 
				"\\newcommand{\\SkillsEntry}[2]{      % Same as \\PersonalEntry\r\n" + 
				"		\\noindent\\hangindent=2em\\hangafter=0 % Indentation\r\n" + 
				"		\\parbox{\\spacebox}{        % Box to align text\r\n" + 
				"		\\textit{#1}}			   % Entry name (birth, address, etc.)\r\n" + 
				"		\\hspace{1.5em} #2 \\par}    % Entry value	\r\n" + 
				"		\r\n" + 
				"\\newcommand{\\EducationEntry}[4]{\r\n" + 
				"		\\noindent \\textbf{#1} \\hfill      % Study\r\n" + 
				"		\\colorbox{Black}{%\r\n" + 
				"			\\parbox{6em}{%\r\n" + 
				"			\\hfill\\color{White}#2}} \\par  % Duration\r\n" + 
				"		\\noindent \\textit{#3} \\par        % School\r\n" + 
				"		\\noindent\\hangindent=2em\\hangafter=0 \\small #4 % Description\r\n" + 
				"		\\normalsize \\par}\r\n" + 
				"\r\n" + 
				"\\newcommand{\\WorkEntry}[4]{				  % Same as \\EducationEntry\r\n" + 
				"		\\noindent \\textbf{#1} \\hfill      % Jobname\r\n" + 
				"		\\colorbox{Black}{\\color{White}#2} \\par  % Duration\r\n" + 
				"		\\noindent \\textit{#3} \\par              % Company\r\n" + 
				"		\\noindent\\hangindent=2em\\hangafter=0 \\small #4 % Description\r\n" + 
				"		\\normalsize \\par}\r\n" + 
				"\r\n" + 
				"%%% Begin Document\r\n" + 
				"%%% ------------------------------------------------------------\r\n" + 
				"");
		
	}
	
}
