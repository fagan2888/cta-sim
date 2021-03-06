package dssg.simulator;

import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.ift.CellProcessor;

public class LogStopEvent {
  private int runId;
  private String taroute;
  private String dir_group;
  private String tageoid;
  private int time_scheduled;
  private int time_actual_arrive;
  private int time_actual_depart;
  private int passengers_on;
  private int passengers_off;
  private int passengers_in;
  private LogStopEvent lastEvent;

  public static CellProcessor[] getReadProcessors() {
    final CellProcessor[] processors = new CellProcessor[] {
        new ParseInt(), // runId
        null, // taroute
        null, // dir_group
        null, // tageoid
        new ParseInt(), // time_scheduled
        new ParseInt(), // time_actual_arrive
        new ParseInt(), // time_actual_depart
        new ParseInt(), // passengers_on
        new ParseInt(), // passengers_off
        new ParseInt() // passengers_in
    };
    return processors;
  }
  public static String[] getHeader() {
    final String[] header = new String[] { "runId", "taroute", "dir_group",
      "tageoid", "time_scheduled", "time_actual_arrive", "time_actual_depart",
      "passengers_on", "passengers_off", "passengers_in" };
    return header;
  }
  
  public LogStopEvent() {
    // nullary constructor
  }

  public LogStopEvent(int runId, String taroute, String dir_group,
      String tageoid, int time_scheduled, int time_actual_arrive,
      int time_actual_depart, int passengers_on, int passengers_off,
      int passengers_in, LogStopEvent lastEvent) {
    this.setRunId(runId);
    this.setTaroute(taroute);
    this.setDir_group(dir_group);
    this.setTageoid(tageoid);
    this.setTime_scheduled(time_scheduled);
    this.setTime_actual_arrive(time_actual_arrive);
    this.setTime_actual_depart(time_actual_depart);
    this.setPassengers_in(passengers_in);
    this.setPassengers_off(passengers_off);
    this.setPassengers_on(passengers_on);
    this.setLastEvent(lastEvent);
  }

  public int getRunId() {
    return runId;
  }
  public void setRunId(int runId) {
    this.runId = runId;
  }
  public String getTaroute() {
    return taroute;
  }
  public void setTaroute(String taroute) {
    this.taroute = taroute;
  }
  public String getDir_group() {
    return dir_group;
  }
  public void setDir_group(String dir_group) {
    this.dir_group = dir_group;
  }
  public String getTageoid() {
    return tageoid;
  }
  public void setTageoid(String tageoid) {
    this.tageoid = tageoid;
  }
  public int getTime_scheduled() {
    return time_scheduled;
  }
  public void setTime_scheduled(int time_scheduled) {
    this.time_scheduled = time_scheduled;
  }
  public int getTime_actual_arrive() {
    return time_actual_arrive;
  }
  public void setTime_actual_arrive(int time_actual_arrive) {
    this.time_actual_arrive = time_actual_arrive;
  }
  public int getTime_actual_depart() {
    return time_actual_depart;
  }
  public void setTime_actual_depart(int time_actual_depart) {
    this.time_actual_depart = time_actual_depart;
  }
  public int getPassengers_on() {
    return passengers_on;
  }
  public void setPassengers_on(int passengers_on) {
    this.passengers_on = passengers_on;
  }
  public int getPassengers_off() {
    return passengers_off;
  }
  public void setPassengers_off(int passengers_off) {
    this.passengers_off = passengers_off;
  }
  public int getPassengers_in() {
    return passengers_in;
  }
  public void setPassengers_in(int passengers_in) {
    this.passengers_in = passengers_in;
  }
  public LogStopEvent getLastEvent() {
    return lastEvent;
  }
  public void setLastEvent(LogStopEvent lastEvent) {
    this.lastEvent = lastEvent;
  }
}
