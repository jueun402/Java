
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class MysqlToMongo {
	
	public static MongoCollection<Document> MongoConnection(String TARGET_DB, String TARGET_COLLECTION) {

		// MongoDB 연동 
		MongoClient mongoClient =  MongoClients.create("mongodb://localhost:27017"); //local MongoDB 서버 연결
		MongoDatabase db = mongoClient.getDatabase(TARGET_DB); 
		try {
			db.createCollection(TARGET_COLLECTION);  // Collection 생성
			
		} catch (Exception e) {
			db.getCollection(TARGET_COLLECTION).drop(); // Collection 삭제 후 
			db.createCollection(TARGET_COLLECTION);  // Collection 생성
		}
		
		MongoCollection<Document> collections = db.getCollection(TARGET_COLLECTION);
		return collections;
	}
	public static void main(String[] args) {

		/**** 1. Mysql empdb.dept => Mongodb empdb.dept ****/
		
		// MySql 
		deptVO dvo = new deptVO();
		deptDAO deptDao = new deptDAO();
		List<deptVO> depdList = deptDao.getDeptList(dvo);   
		
		// MongoDB
		MongoCollection<Document> collections = MongoConnection("empdb", "dept"); // collection 연결 
		List<Document> doc = new ArrayList<Document>();

		for(deptVO dept : depdList){
			doc.add(new Document("Deptno", dept.getDeptno()).append("dname", dept.getDname()).append("loc", dept.getLoc()));
		}
		collections.insertMany(doc);
		
		
		/**** 2. Mysql empdb.emp => Mongodb empdb.emp ****/
		
		// MySql 
		empVO evo = new empVO();
		empDAO empDao = new empDAO();
		List<empVO> empList = empDao.getempList(evo); 
		
		// MongoDB
		MongoCollection<Document> collections1 = MongoConnection("empdb", "emp"); // collection 연결 
		List<Document> doc1 = new ArrayList<Document>();

		for(empVO emp : empList){
			doc1.add(new Document("empno", emp.getEmpno()).append("ename", emp.getEname())
					.append("job", emp.getJob()).append("hiredate", emp.getHiredate())
					.append("deptno", emp.getDeptno()));
			System.out.println("---> " + emp.toString());
		}
		collections1.insertMany(doc1);
				
		
		/**** 3. Mysql empdb.salgrade => Mongodb empdb.salgrade ****/
		
		// MySql 
		salVO svo = new salVO();
		salDAO salDao = new salDAO();
		List<salVO> salList = salDao.getsalList(svo);
		
		
		// MongoDB
		MongoCollection<Document> collections2 = MongoConnection("empdb", "salgrade"); // collection 연결 
		List<Document> doc2 = new ArrayList<Document>();

		for(salVO sal : salList){
			doc2.add(new Document("grade", sal.getGrade()).append("losal", sal.getLosal())
					.append("hisal", sal.getHisal()));
			System.out.println("---> " + sal.toString());

		}
		collections2.insertMany(doc2);
		
	}
}