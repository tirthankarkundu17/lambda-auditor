package in.bitmaskers.LambdaAuditor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;

import in.bitmaskers.LambdaAuditor.beans.Function;
import in.bitmaskers.LambdaAuditor.beans.LambdaFunctions;
import in.bitmaskers.LambdaAuditor.beans.ProvisionedConcurrencyConfig;
import in.bitmaskers.LambdaAuditor.beans.ProvisionedConcurrencyConfigs;

/**
 * Find Lambdas you applied Provisioned Concurrency © Tirthankar Kundu
 */
public class App {

	private static final Gson gson = new Gson();

	public String runCmd(String command) throws Exception {
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		String completeLine = "";
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			completeLine += line;
		}
		return completeLine;
	}

	public boolean isAllotedProvisionedConcurrency(Function lambdaFunction) throws Exception {
		String response = runCmd(
				"aws lambda list-provisioned-concurrency-configs --function-name " + lambdaFunction.getFunctionName());
		ProvisionedConcurrencyConfigs prConcurrencyConfigs = gson.fromJson(response,
				ProvisionedConcurrencyConfigs.class);
		List<ProvisionedConcurrencyConfig> configs = prConcurrencyConfigs.getProvisionedConcurrencyConfigs();
		if (configs.size() > 0) {
			return true;
		}
		return false;
	}

	public LambdaFunctions fetchLambdaFunctions() throws Exception {
		String response = runCmd("aws lambda list-functions");
		LambdaFunctions lambdaFunctions = gson.fromJson(response, LambdaFunctions.class);
		return lambdaFunctions;
	}

	public static void main(String[] args) {
		App app = new App();

		try {
			LambdaFunctions lambdaFunctions = app.fetchLambdaFunctions();
			System.out.println("Total Functions : " + lambdaFunctions.getFunctions().size());
			for (Function lambdaFunction : lambdaFunctions.getFunctions()) {
				System.out.println("###########################################");
				System.out.println("-----------" + lambdaFunction.getFunctionName() + "-----------");
				if (app.isAllotedProvisionedConcurrency(lambdaFunction)) {
					System.out.println("Provisioned Concurrency");
				} else {
					System.out.println("No Provisioned Concurrency");
				}
				System.out.println("###########################################\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
