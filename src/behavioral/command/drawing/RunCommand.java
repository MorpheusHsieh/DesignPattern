package behavioral.command.drawing;

public class RunCommand
{
	public static void main(String[] args)
	{
    ImageService service = new ImageService();
    service.addCommand("AEffect", new AEffectCommand());
    service.addCommand("BEffect", new BEffectCommand());
    service.addCommand("CEffect", new CEffectCommand());
    // 在需要時指定使用某特效
    service.doEffect("AEffect");
    service.doEffect("BEffect");
    service.doEffect("CEffect");
	}

}
