package padroesProjetos.comportamentais;

public class ComandLine {

   /*@formatter:off
    * `{ command: ‘search’, keywords: ‘music mp3’, destination: ‘100.22.11.25:8888’ }`
      `{ command: ‘upload’, filename: ‘music.mp3’, content: [byte array] }`
      `{ command: ‘execute’, script: ‘music.sh’}`
      `{ command: ‘neighbors’, depth: 2, destination: ‘90.12.50.21:8975’}`
      @formatter:on
    */

   private String command;
   private String keywords;
   private String destination;
   private String filename;
   private String content;
   private String script;

   private String depth;

   public ComandLine() {
   }

   public String getCommand() {
      return this.command;
   }

   public String getDestination() {
      return this.destination;
   }

   public String getKeywords() {
      return this.keywords;
   }

   public String getFilename() {
      return this.filename;
   }

   public String getContent() {
      return this.content;
   }

   public String getScript() {
      return this.script;
   }

}