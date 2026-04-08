package day18;

// enum 문서 상태
enum DocumentStatus{
	DRAFT{
		@Override
		public String getMessage() {
			return "문서 작성 진행 중입니다. 수정이 가능합니다.";
		}		
	},
	IN_REVIEW{
		@Override
		public String getMessage() {
			return "문서 검토 중입니다. 수정이 불가합니다.";
		}	
	},
	APPROVED{
		@Override
		public String getMessage() {
			return "문서 승인 되었습니다.";
		}	
	},
	REJECTED{
		@Override
		public String getMessage() {
			return "반려 되었습니다. 다시 작성해주세요.";
		}	
	};
	
	public abstract String getMessage();
	
}

class Document{

	
	private String title;
	private DocumentStatus status;
	
	public Document(String title, DocumentStatus status) {
		this.title = title;
		this.status = status;
	}
	
	public void printStatus() {
		System.out.println("[ " + title +" ] 상태: " + status );
		System.out.println("=> " + status.getMessage());
		System.out.println();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DocumentStatus getStatus() {
		return status;
	}

	public void setStatus(DocumentStatus status) {
		this.status = status;
	}
	
	
	
}

public class EnumEx02 {

	public static void main(String[] args) {
		
//		for(DocumentStatus tmp: DocumentStatus.values()) {
//			System.out.println(tmp);
//		}
		
		Document doc = new Document("기획안 초안", DocumentStatus.DRAFT);
		doc.printStatus();
		
		doc.setStatus(DocumentStatus.IN_REVIEW);
		doc.printStatus();
		
		doc.setStatus(DocumentStatus.APPROVED);
		doc.printStatus();
		
		
	}

}


















