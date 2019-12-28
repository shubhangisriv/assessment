package exam;
public class customer implements Comparable {
		private int eid;
		private String name;
		private String email;
		private int no;
		customer(){}
		
		public customer(int eid, String name, String email, int no) {
			super();
			this.eid = eid;
			this.name = name;
			this.email = email;
			this.no = no;
		}

		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + eid;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + no;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			customer other = (customer) obj;
			if (eid != other.eid)
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (no != other.no)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "customer [eid=" + eid + ", name=" + name + ", email=" + email + ", no=" + no + "]";
		}
		
		
}
